package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class VisitorStatBean {

    private Connection conn = null;
    private ResultSet rs;
    private Statement stmt = null;
    private String query = null;

    @PostConstruct
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visitorstat", "root", "HELLO");
            System.out.println("Database connection established successfully.");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.err.println("Sorry failed to connect to the Database.");
        }
    }

    @PreDestroy
    public void disconnect() {
        try {
            conn.close();
            System.out.println("Database connection closed successfully.");
        } catch (SQLException e) {
            System.err.println("Cannot close the database connection: " + e.getMessage());
        }
    }

    public void addVisitor(String host) {
        try {
            stmt = conn.createStatement();
            query = "INSERT INTO UserStat (hostname, visits) VALUES('" + host + "','1')";
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            try {
                stmt = conn.createStatement();
                query = "UPDATE UserStat SET visits = visits + 1 WHERE hostname = '" + host + "'";
                stmt.executeUpdate(query);
            } catch (SQLException ex) {
                System.err.println("Cannot update: " + ex.getMessage());
            }
        }
    }
}

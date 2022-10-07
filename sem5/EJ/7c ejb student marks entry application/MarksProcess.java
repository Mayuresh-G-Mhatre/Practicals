package p2;

import javax.ejb.Stateful;
import java.sql.*;

@Stateful
public class MarksProcess implements MarksProcessLocal {

    Connection con = null;
    Statement stm = null;

    public MarksProcess() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String addMarks(String rollno, String sub1, String sub2, String sub3) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyit", "root", "HELLO");
            String insertQuery = "insert into marks values(" + rollno + "," + sub1 + "," + sub2 + "," + sub3 + ")";
            stm = con.createStatement();
            stm.executeUpdate(insertQuery);
            return "MARKS DATA INSERTED";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return " ";
    }
}

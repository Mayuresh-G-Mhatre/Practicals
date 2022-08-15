package p1;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection con = null;
        PreparedStatement ps = null;
        String username = request.getParameter("uname");
        String password = request.getParameter("pw");
        String email = request.getParameter("email");
        String country = request.getParameter("coun");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyit?useSSL=false", "root", "HELLO");
            out.println("Connection successfull...");
            ps = con.prepareStatement("insert into emp values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, country);
            ps.executeUpdate();
            out.println("Data inserted successfully");
        }
        catch(Exception e) {
            out.println(e);
        }
        out.println("<br>" + "<br>");
    }
}
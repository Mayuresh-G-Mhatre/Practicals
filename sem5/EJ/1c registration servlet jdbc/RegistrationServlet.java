package p1;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String country = request.getParameter("country");    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver connected..." + "<br>");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?autoReconnect=true&useSSL=false", "root", "password");
            out.println("Connection done successfulyy..." + "<br>");
       
            ps = con.prepareStatement("insert into emp values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, country);
            ps.executeUpdate();
            out.println("Data inserted successfully...");
        }
        catch(Exception e) {
            out.println("<br>" + "<br>");
//            out.println("Exception: " + e);
        }
        
        
    }
}
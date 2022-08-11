package p1;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("Driver connected..." + "<br>");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyit?autoReconnect=true&useSSL=false", "root", "password");
//            out.println("Connection done successfully..." + "<br>");
       
            ps = con.prepareStatement("SELECT ans FROM info");
            ResultSet res = ps.executeQuery();
            int no = 1;
            out.println("<h1>" + "Results" + "</h1>");
            while(res.next()) {                
                if(res.getString(1).equals(request.getParameter("q" + no))) {
                    out.println(no + "." + " Correct" + "<br>");
                    no++;
                }
                else {
                    out.println(no + "." + " Incorrect" + "<br>");
                    no++;
                }
            }
        }
        catch(Exception e) {
            out.println("<br>" + "<br>");
//            out.println("Exception: " + e);
        }
    }
}
package p1;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class QuizServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String paramName;
        String[] paramValue;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        int cnt = 0;
        String ans = "";
        Enumeration paramNames = request.getParameterNames();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tyit", "root", "HELLO");
            out.println("Connection done successfully");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select ans from info");
            while(rs.next() && paramNames.hasMoreElements()) {
                String un = rs.getString(1);
                paramName = (String)paramNames.nextElement();
                paramValue = request.getParameterValues(paramName);
                for(int i=0; i<paramValue.length; i++) {
                    ans = paramValue[i];
                    if(un.equals(ans))
                        cnt++;
                }
            }
            out.println("<h1>YOU HAVE SCORED " + cnt + " POINTS OUT OF 3</h1>");
        }
        catch(Exception e) {
            out.println("SORRY! TRY AGAIN");
        }
    }
}

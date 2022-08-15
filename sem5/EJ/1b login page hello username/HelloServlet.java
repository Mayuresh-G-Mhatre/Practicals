package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n1 = request.getParameter("username");
        String n2 = request.getParameter("password");
        if(n1.equals("shubham") && n2.equals("shubham1234")) {
            out.println("HELLO... " + n1);
        }
        else {
            out.println("LOGIN FAILED... ");
        }
    }
}
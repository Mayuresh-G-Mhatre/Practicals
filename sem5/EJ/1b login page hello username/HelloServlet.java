package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("username");
        String pswd = request.getParameter("password");
        
        if(uname.equals("shubham") && pswd.equals("123456789")) {
            out.println("Hello, " + uname);
        }
        else {
            out.println("Login Failed!!!");
        }
    }
}
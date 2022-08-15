package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestDispatcherServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        String n = request.getParameter("username");
        String p = request.getParameter("password");
        if(p.equals("Servlet")) {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);
        }
        else {
            out.println("Username or password error!");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
    }
}
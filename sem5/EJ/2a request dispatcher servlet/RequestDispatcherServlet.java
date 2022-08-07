package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestDispatcherServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(password.equals("Servlet")) {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);
        }
        else {
            out.println("Sorry username or password error!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);
        }
    }
}
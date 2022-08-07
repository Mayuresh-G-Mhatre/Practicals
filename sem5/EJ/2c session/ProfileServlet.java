package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        HttpSession session = request.getSession(false);
        if(session != null) {
            String name = (String) session.getAttribute("name");
            out.println("Hello, " + name + ". Welcome to Profile");
        }
        else {
            out.println("Please login first");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}
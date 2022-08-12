package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if(password.equals("admin123")) {
            out.println("Welcome " + name);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
        }
        else {
            out.println("Sorry, username or password error!");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}
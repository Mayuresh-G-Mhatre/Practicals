package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String n1 = request.getParameter("txt1");
        String n2 = request.getParameter("txt2");
        String op = request.getParameter("op");
        
        if(op.equals("Addition")) {
            out.println("Addition result is " + (Integer.parseInt(n1)+Integer.parseInt(n2)));
        }
        else if(op.equals("Subtraction")) {
            out.println("Subtraction result is " + (Integer.parseInt(n1)-Integer.parseInt(n2)));
        }
        else if(op.equals("Multiplication")) {
            out.println("Multiplication result is " + (Integer.parseInt(n1)*Integer.parseInt(n2)));
        }
        else {
            out.println("Division result is " + (Integer.parseInt(n1)/Integer.parseInt(n2)));
        }
    }
}
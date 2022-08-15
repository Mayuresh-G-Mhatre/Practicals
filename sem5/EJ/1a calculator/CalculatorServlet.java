package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String num1 = request.getParameter("txt1");
        String num2 = request.getParameter("txt2");
        String op = request.getParameter("op");
        if(op.equals("Addition")) {
            out.println("Addition result is ------- " + (Integer.parseInt(num1)+Integer.parseInt(num2)));
        }
        else if(op.equals("Subtraction")) {
            out.println("Subtraction result is ------- " + (Integer.parseInt(num1)-Integer.parseInt(num2)));
        }
        else if(op.equals("Multiplication")) {
            out.println("Multiplication result is ------- " + (Integer.parseInt(num1)*Integer.parseInt(num2)));
        }
        else {
            out.println("Division result is ------- " + (Integer.parseInt(num1)/Integer.parseInt(num2)));
        }
    }
}
            
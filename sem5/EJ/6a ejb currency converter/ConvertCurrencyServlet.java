package p1;

import p1.CurrencyConverterBean;
import java.io.*;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ConvertCurrencyServlet", urlPatterns = {"/ConvertCurrencyServlet"})
public class ConvertCurrencyServlet extends HttpServlet {
    @EJB
    CurrencyConverterBean converterBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String amount = request.getParameter("amount");
            if (amount != null && amount.length() > 0) {
                BigDecimal d = new BigDecimal(amount);
                BigDecimal convertedAmount = converterBean.convert(request.getParameter("From"), request.getParameter("To"), d);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Converted Currency</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println(amount + " " + request.getParameter("From") + " = ");
                out.println(convertedAmount + " " + request.getParameter("To"));
                out.println("<br/>Click <a href='CurrencyConversion.jsp'>here</a> to go back");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}

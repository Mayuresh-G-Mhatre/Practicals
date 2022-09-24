package p1;

import java.io.IOException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cart extends HttpServlet {

    cartBeanLocal cartBean = lookupcartBeanLocal();

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        
            try (PrintWriter out = response.getWriter()) 
            {
                if(request.getParameter("pr")!= null)
                {
                    //ADDING IN CART
                
                    String[] det = request.getParameter("pr").split(":");
                    out.print(cartBean.addToCart(det[0],det[1],det[2]));
                }
                else if (request.getParameter("show")!= null)
                {
                    //DISPLAYING CART
                    String allrows = cartBean.showCart();
                    allrows = allrows.substring(0,allrows.length()-1);
                    //out.print(allrows);
                    String [] irow = allrows.split(";");
                    out.print("<table>");
                    for(int i =0;i<irow.length;i++)
                    {
                        out.print("<tr><td>"+irow[i].split(":")[0]+"</td><td>"+irow[i].split(":")[1]+"</td><td>"+irow[i].split(":")[2]+"</td></tr>");
                    }
                    out.print("</table>");
                }
            }
        }

        private cartBeanLocal lookupcartBeanLocal() {
            try {
                Context c = new InitialContext();
                return (cartBeanLocal) c.lookup("java:global/Practical6c/cartBean!p1.cartBeanLocal");
            } catch (NamingException ne) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
                throw new RuntimeException(ne);
            }
        }
        
}

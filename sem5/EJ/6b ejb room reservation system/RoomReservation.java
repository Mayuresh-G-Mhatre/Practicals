package p1;

import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;

public class RoomReservation extends HttpServlet   {
    RmRegLocal rmReg = lookupRmRegLocal();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try 
        {
            out = response.getWriter();
            String user = request.getParameter("uname");
            String dt = request.getParameter("rdate");
            String rn = request.getParameter("roomno");
            String[] dtpart = dt.split("-");  //yy-mm-dd
            Date date = new Date(Integer.parseInt(dtpart[0]),Integer.parseInt(dtpart[1]),Integer.parseInt(dtpart[2]));
            out.print(rmReg.addRoomReg(user, date,Integer.parseInt(rn)));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private RmRegLocal lookupRmRegLocal() {
        try {
            Context c = new InitialContext();
            return (RmRegLocal) c.lookup("java:global/Practical6b/RmReg!p1.RmRegLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

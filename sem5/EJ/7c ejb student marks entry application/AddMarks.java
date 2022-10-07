package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import p2.MarksProcessLocal;

public class AddMarks extends HttpServlet {

    MarksProcessLocal marksProcess = lookupMarksProcessLocal();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            if (request.getParameter("rollno") != null) {
                String rn = request.getParameter("rollno");
                String ej = request.getParameter("sub1");
                String lsa = request.getParameter("sub2");
                String spm = request.getParameter("sub3");
                out.print(marksProcess.addMarks(rn, ej, lsa, spm));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MarksProcessLocal lookupMarksProcessLocal() {
        try {
            Context c = new InitialContext();
            return (MarksProcessLocal) c.lookup("java:global/Practical7c/MarksProcess!p2.MarksProcessLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

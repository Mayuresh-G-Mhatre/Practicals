package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FileDownloadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String filename = "Learn Linux Quickly.pdf";  // full name of file to be downloaded
        String filepath = "/home/andrio/Uploads"; // path where the file is present
        response.setContentType("APPLICATION/OCTET-STREAM");
        // for windows
        // response.setHeader("Content-Disposition", "attachment; filename=\""+ filename +"\"");
        // FileInputStream fileInputStream = new FileInputStream(filepath + filename);
        // for windows
   
        // for linux
        response.setHeader("Content-Disposition", "attachment; filename=\""+ filename +"/");
        FileInputStream fileInputStream = new FileInputStream(filepath + "/" + filename);
        // for linux
        
        int i;
        while((i=fileInputStream.read()) != -1) {
            out.write(i);
        }
        fileInputStream.close();
        out.close();
    }
}

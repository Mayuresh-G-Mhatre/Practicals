package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

public class FileUploadServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // here "/home/andrio/Uploads" is the path where to upload/save the file 
        // and 10 is the max size of file in mB and following 1024's are multiplied to convert into kB and then Bytes
        MultipartRequest m = new MultipartRequest(request, "/home/andrio/Uploads", 10*1024*1024);
        out.println("File successfully uploaded!");
    }
}
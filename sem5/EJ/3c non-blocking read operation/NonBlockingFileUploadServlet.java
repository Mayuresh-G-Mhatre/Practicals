package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NonBlockingFileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        final AsyncContext content = request.startAsync();
        final ServletInputStream sis = request.getInputStream();
        System.out.println(getServletContext().getRealPath("/") + "TYIT Syllabus.pdf");
        final File fileToUpload = new File(getServletContext().getRealPath("/") + "TYIT Syllabus.pdf");
        final FileOutputStream fos = new FileOutputStream(fileToUpload);
        sis.setReadListener(new ReadListener() {
            byte[] buffer = new byte[1024*4];
            @Override
            public void onDataAvailable() throws IOException {
                do {
                    int length = sis.read(buffer);
                    System.out.println("DATA READ...  " + length);
                    fos.write(buffer, 0, length);
                }while(sis.isReady());
            }
            @Override
            public void onAllDataRead() throws IOException {
                content.complete();
                fos.close();
                System.out.println("UPLOAD COMPLETED...");
            }
            @Override
            public void onError(Throwable t) {
                System.out.println("onError()" + t.getMessage());
            }
        });
    }
}
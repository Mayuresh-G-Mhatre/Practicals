<%@page contentType="text/html" import="java.sql.*" %>
<html>
    <body>
        <h1>Employee Record Update</h1>
        <%
            String eno = request.getParameter("txtEno");
            String name = request.getParameter("txtName");
            String age = request.getParameter("txtAge");
            String designation = request.getParameter("txtDesignation");
            String sal = request.getParameter("txtSal");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyit", "root", "HELLO");
                PreparedStatement ps = con.prepareStatement("select * from employee where eno=?");
                ps.setString(1, eno);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    out.println("<h1> Employee " + name + " Exist </h1>");
                    PreparedStatement pst1 = con.prepareStatement("update employee set sal=? where eno=?");
                    PreparedStatement pst2 = con.prepareStatement("update employee set age=? where eno=?");
                    PreparedStatement pst3 = con.prepareStatement("update employee set designation=? where eno=?");
                    pst1.setString(1, sal);
                    pst1.setString(2, eno);
                    pst2.setString(1, age);
                    pst2.setString(2, eno);
                    pst3.setString(1, designation);
                    pst3.setString(2, eno);
                    pst1.executeUpdate();
                    pst2.executeUpdate();
                    pst3.executeUpdate();
                } 
                else {
                    out.println("<h1>Employee Record not exist !!!!!</h1>");
                }
            }
            catch (Exception e) {
                out.println(e);
            }
        %>
    </body>
</html>

<%@page contentType="text/html" import="java.sql.*"%>
<html>
    <body>
        <h1>LOGIN PAGE</h1>
        <%
            String uname = request.getParameter("txtName");
            String pass = request.getParameter("txtPass");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyit", "root", "HELLO");
                PreparedStatement ps = con.prepareStatement("select password from user where username=?");
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    if (pass.equals(rs.getString(1))) {
                        out.println("<h1>~~~LOGIN SUCCESSFULL~~~</h1>");
                    }
                } 
                else {
                    out.println("<h1>Username does not exist!!!</h1>");
        %><jsp:include page="register.jsp"></jsp:include>
        <%
                }
            } 
            catch (Exception e) {
                out.println(e);
            }
        %>
    </body>
</html>

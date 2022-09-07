<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    application.setAttribute("author", "Shubham");
    session.setAttribute("country", "India");
%>
<html>
    <head>
        <title>EXPRESSION LANGUAGE DEMO</title>
    </head>
    <body>
        <form action ="show.jsp">
            FIRST NAME: <input type="text" name="fname"/><br>
            LAST NAME: <input type="text" name="lname"/><br>
            <input type="submit" value="CHECK EL USE"/><br>
        </form>
    </body>
</html>

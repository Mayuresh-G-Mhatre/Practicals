<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        First Name:<b> <c:out value="${param.fname}"></c:out></b><br/>
        Last Name:<b> <c:out value="${param.lname}"></c:out></b><br/><br/>
        
        USE OF IF STATEMENT
        <br>
        <c:set var="mycount" value="25"/>
        <c:if test="${mycount == 25}">
            <b><c:out value="your count is 25"/></b>
        </c:if>
        <br><br>
        
        USE OF forEach STATEMENT
        <br>
        <c:forEach var="count" begin="101" end="105">
            <b><c:out value = "${count}"/></b>
        </c:forEach>
        <br><br>
        
        EXCEPTION CATCHING EXAMPLE
        <p>
        <c:catch var="myException">
        <% int number = 10/0;%>
        </c:catch>
        <b>The Exception is : ${myException}</b>
        </p>
    </body>
</html>

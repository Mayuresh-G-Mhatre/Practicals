<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% pageContext.setAttribute("color", "yellow");%>
<!DOCTYPE html>
<html><head><title>Display Page</title></head>
    <body bgcolor="${pageScope.color}">
        <b> Welcome!!!! ${param.fname} ${param.lname}  </b>
        Below we are accessing Application object:
        <p>
            Author Name: <b> ${applicationScope.author} </b>
        </p>  
        Below we are accessing Session object:
        <p>
            Author Country: <b> ${sessionScope.country} </b>
        </p>  
        Below we are showing some basic comparisons using EXPRESSION LANGUAGE:
        <p>
            Is 1 less than 2 ? $ {1<2}    <br>
            Does 5 equal 5 ?   $ {5 == 5} <br>
            Is 6 greater than 7 ? ${6 gt 7}<br>
        </p>  
        Below we are showing some basic Arithmetic Operators using EXPRESSION LANGUAGE:
        <p>
            6 + 7 = ${6+7} <br>
            8 * 9 = ${8*9} <br>
        </p>
        <hr> CURRENTLY THE  BROWSER USED IS:
        ${header["user-agent"]}
    </body>
</html>

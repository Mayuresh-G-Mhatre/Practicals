<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Use of Intrinsic Objects</h1>
        <h1>Request Object</h1>
        Query String: <%= request.getQueryString()%><br>
        Context Path: <%= request.getContextPath()%><br>
        Remote Host: <%= request.getRemoteHost()%><br>
        <h1>Response Object</h1>
        Character Encoding: <%= response.getCharacterEncoding()%><br>
        Content Type: <%= response.getContentType()%><br>
        Locale: <%= response.getLocale()%><br>
        <h1>Session Object</h1>
        ID: <%= session.getId()%><br>
        Creation Time: <%= session.getCreationTime()%><br>
        Local Access Time: <%= new java.util.Date(session.getLastAccessedTime())%><br>        
    </body>
</html>

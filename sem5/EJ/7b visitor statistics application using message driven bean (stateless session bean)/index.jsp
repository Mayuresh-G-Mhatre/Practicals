<%@page import="javax.jms.JMSException, javax.naming.InitialContext, javax.jms.TextMessage, javax.jms.MessageProducer, javax.jms.Session, javax.jms.Connection, javax.jms.Queue, javax.jms.ConnectionFactory" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    private static ConnectionFactory connectionFactory;
    private static Queue queue;

    Connection connection = null;
    Session mysession = null;
    MessageProducer messageProducer = null;
    TextMessage message = null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome To Shubham's Home Page</title>
    </head>
    <body style="background-color: yellow;">
        <h1>Welcome To Shubham Indalkar's Home page</h1>
        <%
            try {
                InitialContext ctx = new InitialContext();
                queue = (Queue) ctx.lookup("jms/Queue");
                connectionFactory = (ConnectionFactory) ctx.lookup("jms/QueueFactory");

                connection = connectionFactory.createConnection();
                mysession = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
                messageProducer = mysession.createProducer(queue);
                message = mysession.createTextMessage();

                message.setText(request.getRemoteAddr());
                messageProducer.send(message);
            } catch (JMSException e) {
                System.out.println("Exception occurred: " + e.toString());
            }
        %>
    </body>
</html>

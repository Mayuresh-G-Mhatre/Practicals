<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="p1.Product"%>
<%@page import="java.util.*" %>%
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            private EntityManagerFactory emf;
            private EntityManager em;
            private EntityTransaction et;
            private List<Product> allprods;
        %>
        <%
            emf = Persistence.createEntityManagerFactory("InventoryJPAPU");
            em = emf.createEntityManager();
            Product product = new Product();
            product.setPname("Board");
            product.setPprice(150);
            product.setPqty(200);
            
            product.setPname("Chair");
            product.setPprice(350);
            product.setPqty(50);
            et = em.getTransaction();
            et.begin();
            em.persist(product);
            et.commit();
            em.close();
         %>
       </body>
</html>

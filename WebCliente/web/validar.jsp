<%-- 
    Document   : validar
    Created on : 07-sep-2015, 23:22:30
    Author     : javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%! 
        String ide;
        String contra;
        %> 
    </head>
    <body>
       <%
        ide = request.getParameter("username");
        contra = request.getParameter("password");
        if(ide.equals("admi") && contra.equals("admi")){
            response.sendRedirect("Inicio.jsp");
        }else{
            
        }
       %> 
    </body>
</html>

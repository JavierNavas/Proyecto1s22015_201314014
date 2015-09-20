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
        String tipo;
        boolean resultado=false;
        %> 
    </head>
    <body>
       <%
        ide = request.getParameter("username");
        contra = request.getParameter("password");
        tipo= request.getParameter("combo");
         try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	boolean result = port.login(ide, contra, tipo);
        resultado=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        if(ide.equals("admi") && contra.equals("admi")){
            response.sendRedirect("Inicio.jsp");
        }else if(resultado&&tipo.equals("Administrador")){
            response.sendRedirect("Administrador.jsp");
            resultado=false;
        }else if(resultado&&tipo.equals("Estacion General")){
            response.sendRedirect("EstacionGeneral.jsp");
            resultado=false;
        }else if(resultado&&tipo.equals("Estacion Clave")){
            response.sendRedirect("EstacionClave.jsp");
            resultado=false;
        }else if(resultado&&tipo.equals("Chofer")){
            response.sendRedirect("Chofer.jsp");
            resultado=false;
        }else{
            request.setAttribute("mensaje","Usuario Incorrecto");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
       %> 
    </body>
</html>

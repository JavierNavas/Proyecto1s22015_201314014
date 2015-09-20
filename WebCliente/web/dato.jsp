<%-- 
    Document   : dato
    Created on : 18-sep-2015, 16:35:58
    Author     : javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
       String correo;
       String contra;
       boolean resultado=false;
          %>
    </head>
    <body>
        <%
         correo = request.getParameter("correoAdmi");
         contra = request.getParameter("contrAdmi");
            
        if (request.getParameter("boton1") != null)
        {
            try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.agregarAdministrador(correo, contra);
        resultado=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
            if(resultado){
            request.setAttribute("mensaje","Ingresado Correctamente");
            request.getRequestDispatcher("Inicio.jsp#portfolio").forward(request, response);
            }else{
            request.setAttribute("mensaje","No se logro Agregar");
            request.getRequestDispatcher("Inicio.jsp#portfolio").forward(request, response);
            }
        }
        else if (request.getParameter("boton2") != null)
        {
             try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.eliminarAdministrador(correo);
        resultado=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
            if(resultado){
            request.setAttribute("mensaje","Eliminado Correctamente");
            request.getRequestDispatcher("Inicio.jsp#portfolio").forward(request, response);
            }else{
            request.setAttribute("mensaje2","No se Logro Eliminar");
            request.getRequestDispatcher("Inicio.jsp#portfolio").forward(request, response);
            }
        }
    %>
</body>
</html>


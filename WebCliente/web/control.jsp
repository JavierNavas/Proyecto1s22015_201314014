<%-- 
    Document   : agregaradmi
    Created on : 18-sep-2015, 17:58:36
    Author     : javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%String correo;
       String contra;
       String contra2;
       String idEstacionClave;
       String nombreEstacionClave;
       String contraEstacionClave;
       String idEliminarEstacionClave;
       String idEstacionG;
       String nombreEstacionG;
       String contraEstacionG;
       String  idEliminarEstacionG;
       boolean resultado=false;
       boolean resultadoc=false;
       boolean resultadog=false;
       %>
    </head>
    <body>
        <%
       correo = request.getParameter("correoAdmi");
       contra = request.getParameter("contrAdmi");
       contra2 = request.getParameter("eliminarAdmi");
       idEstacionClave= request.getParameter("idEstacionC");
       nombreEstacionClave= request.getParameter("nombreEstacionC");
       contraEstacionClave   = request.getParameter("contraEstacionC");
       idEliminarEstacionClave= request.getParameter("eliminarEstacionC");
        if (request.getParameter("boton1") != null){
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
            request.setAttribute("mensaje2","Ingresado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje2","No se logro Agregar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
        }else if (request.getParameter("boton2") != null)
        {
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.eliminarAdministrador(contra2);
	resultado=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
 
            if(resultado){
            request.setAttribute("mensaje3","Eliminado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje3","No se Logro Eliminar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
        }else if (request.getParameter("boton3") != null)
        {

    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(idEstacionClave);
	// TODO process result here
	boolean result = port.agregarEstacionC(id, nombreEstacionClave,contraEstacionClave);
	resultadoc=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
       if(resultadoc){
            request.setAttribute("mensaje4","Agregado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje4","No se Logro Agregar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
    
        }
        else if (request.getParameter("boton4") != null)
        {

    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(idEliminarEstacionClave);
	// TODO process result here
	boolean result = port.eliminarEstacionC(id);
	resultadoc=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
      if(resultadoc){
            request.setAttribute("mensaje5","Eliminado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje5","No se Logro Eliminar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
    
    
        }
        else if (request.getParameter("boton6") != null)
        {
       idEstacionG= request.getParameter("idEstacionG");
       nombreEstacionG= request.getParameter("nombreEstacionG");
       contraEstacionG   = request.getParameter("contraEstacionG");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(idEstacionG);
	// TODO process result here
	boolean result = port.agregarEstacionG(id,nombreEstacionG, contraEstacionG);
	resultadog=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
       if(resultadog){
            request.setAttribute("mensaje6","Agregago Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje6","No se Logro Agregar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
       
        }
        else if (request.getParameter("boton7") != null)
        {
       idEliminarEstacionG= request.getParameter("eliminarEstacionG");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(idEliminarEstacionG);
	// TODO process result here
	boolean result = port.eliminarEstacionG(id);
	resultadog=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
       if(resultadog){
            request.setAttribute("mensaje7","Eliminado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }else{
            request.setAttribute("mensaje7","No se Logro Eliminar");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
            }
       
        }
    else if (request.getParameter("boton20") != null)
        {
    try {
        String correoAntiguo=request.getParameter("modificarAdmi");
                String correoNuevo=request.getParameter("modificarAdmico");
                        String contraNuevo=request.getParameter("modificarcontra");
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here

	// TODO process result here
	boolean result = port.modificarAdmi(correoAntiguo, correoNuevo, contraNuevo);
	if(result){
           request.setAttribute("mensaje8","Modificado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }else{
            request.setAttribute("mensaje8","Error no se modifico");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    else if (request.getParameter("boton21") != null)
        {
            String iviejo=request.getParameter("modificaridantiguo");
            String inuevo=request.getParameter("modificaridnuevo");
            String nombrenuevo=request.getParameter("modificarnombre");
            String contranuevo=request.getParameter("modificarcontraest");
      try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int idviejo = Integer.parseInt(iviejo);
	int idnuevo = Integer.parseInt(inuevo);
	// TODO process result here
	boolean result = port.modificarEstacionC(idviejo, idnuevo, nombrenuevo, contranuevo);
	if(result){
           request.setAttribute("mensaje9","Modificado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }else{
            request.setAttribute("mensaje9","Error no se modifico");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }

        }
        else if (request.getParameter("boton22") != null)
        {
            String antiguo=request.getParameter("modificarooooo");
            String nuevo=request.getParameter("modificarppppp");
            String nombrenuevo=request.getParameter("modificarnnnn");
            String contranuevo=request.getParameter("modificarcoccct");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int idantiguo = Integer.parseInt(antiguo);
	int idnuevo = Integer.parseInt(nuevo);
	// TODO process result here
	boolean result = port.modificarEstaciong(idantiguo, idnuevo, nombrenuevo, contranuevo);
	if(result){
           request.setAttribute("mensaje10","Modificado Correctamente");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }else{
            request.setAttribute("mensaje10","Error no se modifico");
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }


        }

     %>
    </body>
</html>

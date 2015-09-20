<%-- 
    Document   : ModuloRuta
    Created on : 19-sep-2015, 9:50:54
    Author     : javier
--%>
<%int cantidad=0;
int cantidad2=0;
int tamano=0;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 8 ]><html class="no-js ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="no-js ie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js ie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
<head>
   <!--- Basic Page Needs
   ================================================== -->
   <meta charset="utf-8">
	<title>Modulo Ruta</title>
	<meta name="description" content="">  
	<meta name="author" content="">

   <!-- Mobile Specific Metas
   ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- CSS
    ================================================== -->
   <link rel="stylesheet" href="css/base.css">
	<link rel="stylesheet" href="css/main.css">
   <link rel="stylesheet" href="css/media-queries.css">
    <link rel="stylesheet" href="css/tabla.css"> 

   <!-- Script
   =================================================== -->
	<script src="js/modernizr.js"></script>

   <!-- Favicons
	=================================================== -->
	<link rel="shortcut icon" href="favicon.png" >

</head>

<body>

   <div id="top"></div>
   <div id="preloader"> 
	   <div id="status">
         <img src="images/loader.gif" height="60" width="60" alt="">
         <div class="loader">Loading...</div>
      </div>
   </div>

   <!-- Header
   =================================================== -->
   <header id="main-header">

   	<div class="row header-inner">

	      <nav id="nav-wrap">         
	         
	         <a class="mobile-btn" href="#nav-wrap" title="Show navigation">
	         	<span class='menu-text'>Show Menu</span>
	         	<span class="menu-icon"></span>
	         </a>
         	<a class="mobile-btn" href="#" title="Hide navigation">
         		<span class='menu-text'>Hide Menu</span>
         		<span class="menu-icon"></span>
         	</a>         

	         <ul id="nav" class="nav">
	            <li><a href="Inicio.jsp">Inicio.</a></li>
                    <li><a href="Inicio.jsp#portfolio">Administrador.</a></li>
	            <li><a href="Inicio.jsp#services">Estacion Clave.</a></li>
	            <li><a href="Inicio.jsp#about">Estacion General.</a></li>
                    <li ><a href="ModuloBus.jsp">Bus.</a></li>
	            <li ><a href="ModuloChofer.jsp">Chofer.</a></li>
                     <li class="current"><a href="ModuloRuta.jsp">Ruta.</a></li>
	         </ul> 

	      </nav> <!-- /nav-wrap -->	      

	   </div> <!-- /header-inner -->

   </header>


   <!-- Page Title
   ================================================== -->
   <section id="page-title">	
   	  
		<div class="row">

			<div class="twelve columns">

				<h1>Modulo Ruta<span>.</span></h1>
				<p>Agrege,Elimine,modifique</p>

			</div>			    

		</div> <!-- /row -->	   

   </section> <!-- /page-title -->


   <!-- Content
   ================================================== -->
   <section id="content">
       
     <div class="row form-section">

                 <div class="twelve columns">
                  <form name="agregarru" action="ModuloRuta.jsp" method="post">
                        <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	// TODO process result here
	int result = port.obtenertamanoc();
        cantidad=result;
    } catch (Exception ex) {
	out.println("error");
    }                   
 %>
 
    <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	// TODO process result here
	int result = port.obtenertamanoG();
	cantidad2=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>

    <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	// TODO process result here
	int result = port.obtenertamanotemp();
	tamano=result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
                  </form>
                  <form name="agregarruu" action="ModuloRuta.jsp" method="post">

	         <div class="row" align="center" >
                     <h3>Agregacion.</h3>
                     <hr />
                 </div>
                 <div class="row" align="center" >
                     <div class="six columns mob-whole"> 
                          <h3>Estacion Clave.</h3>
                         <select name="estacionclave">
          <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int pos = 0;
        if(cantidad!=0){
	// TODO process result here
        for(int i=0;i<cantidad;i++){
	java.lang.String result = port.obtenerc(i);
        %> <option><%out.println(result);%></option> <%
        }
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>                   
                         </select>
                     </div>
                     <div class="six columns mob-whole"> 
                           <h3>Estacion General.</h3>
                         <select name="estaciongeneral">
    <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int pos = 0;
        if(cantidad2!=0){
	// TODO process result here
        for(int i=0;i<cantidad2;i++){
         java.lang.String result = port.obtenerG(i);
        %> <option><%out.println(result);%></option> <%
        }
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
                         </select>
                     </div>
                 </div>
                  <br/>
                  <div class="row" align="center" >
                      <div class="six columns mob-whole">               	
                            <input type="submit" value="Agregar Estacion C" name="boton13"/>
                     </div>
                       <div class="six columns mob-whole">               	
                            <input type="submit" value="Agregar Estacion G" name="boton14"/>
                     </div>
    <%
    if (request.getParameter("boton13") != null){
        String nombre=request.getParameter("estacionclave");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.agregarestaciontemp(nombre);
	if(result){
            %>
             <script>alert("Se Agrego Estacion correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Agregado");</script>
            <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>
    
    <%
     if (request.getParameter("boton14") != null){
        String nombre=request.getParameter("estaciongeneral");
    try {
         
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.agregarestaciontemp(nombre);
	if(result){
            %>
             <script>alert("Se Agrego Estacion correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Agregado");</script>
            <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    }
    %>

                   
                 </div>
                  <br/>
                   <div class="row" align="center" >
                  <table border="0" cellpadding="0" cellspacing="0" class="tabla">
                      <thead>
                          <tr>
                              <th>Estaciones Agregadas a la ruta</th>
                          </tr>
                      </thead>
                      <tbody>
    <%
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int id = 0;
	if(tamano!=0){
	// TODO process result here
        for(int i=0;i<tamano;i++){
	java.lang.String result = port.obtenerestaciontemp(i);
        %>
         <tr class="modo1">
              <td><%out.println(result);%></td>
         </tr>
        <%
        }
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
                      </tbody>
                  </table>
                   </div>
                  <br/>
                 <div class="row" align="center" >
                     <div class="six columns mob-whole">               	
                            <input type="text" name="NombreRuta"  placeholder="Nombre" size="35"/>
                     </div>
                     <div class="row" align="center">
                      <input type="submit" value="Agregar Datos" name="boton12"/>              
               </div>
    <%
     if (request.getParameter("boton12") != null){
           String nombre=request.getParameter("NombreRuta");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.agregarRuta(nombre);
        out.print(""+result);
        if(result){
            %>
             <script>alert("Se Agrego la Ruta correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Agrego");</script>
            <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
     }
    %>

               </div>
    <div class="row" align="center" >
                     <h3>Eliminacion.</h3>
                     <hr />
                 </div>
   <div class="row" align="center" >
                     <div class="six columns mob-whole">               	
                            <input type="text" name="NombreRuta2"  placeholder="Nombre" size="35"/>
                     </div>
                     <div class="row" align="center">
                      <input type="submit" value="Eliminar Ruta" name="boton15"/>              
               </div>
   </div>
    <%
      if (request.getParameter("boton15") != null){
           String nombre=request.getParameter("NombreRuta2");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.eliminarRuta(nombre);
        if(result){
            %>
             <script>alert("Se Elimino la Ruta correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Elimino");</script>
            <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
      }
    %>

                  </form>
      </div>
   </section> <!-- /content -->  


   <!-- Footer
   ================================================== -->
   <footer>

      <div class="row">       

         <div class="six columns tab-whole footer-about">
				
				<h3>About Transmetro</h3>
               
            <p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet.
            Aenean sollicitudin, lorem quis bibendum auctor, nisi elit consequat ipsum, nec sagittis sem
            nibh id elit. 
            </p>

            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor 
            	incididunt ut labore et dolore magna aliqua.</p>        

         </div> <!-- /footer-about -->

         <p class="copyright">&copy; Copyright 2014 Puremedia. Design by <a href="http://www.styleshout.com/">Styleshout.</a></p>        

         <div id="go-top">
            <a class="smoothscroll" title="Back to Top" href="#top"><span>Top</span><i class="fa fa-long-arrow-up"></i></a>
         </div>

      </div> <!-- /row -->

   </footer> <!-- /footer -->


   <!-- Java Script
   ================================================== -->
   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <script>window.jQuery || document.write('<script src="js/jquery-1.10.2.min.js"><\/script>')</script>
   <script type="text/javascript" src="js/jquery-migrate-1.2.1.min.js"></script>   
   <script src="js/jquery.flexslider.js"></script>
   <script src="js/jquery.fittext.js"></script>
   <script src="js/backstretch.js"></script> 
   <script src="js/waypoints.js"></script>  
   <script src="js/main.js"></script>

</body>

</html>


<%-- 
    Document   : ModuloBus
    Created on : 19-sep-2015, 9:50:40
    Author     : javier
--%>

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
	<title>Modulo Bus</title>
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
                    <li class="current"><a href="ModuloBus.jsp">Bus.</a></li>
	            <li ><a href="ModuloChofer.jsp">Chofer.</a></li>
                     <li><a href="ModuloRuta.jsp">Ruta.</a></li>
	         </ul> 

	      </nav> <!-- /nav-wrap -->	      

	   </div> <!-- /header-inner -->

   </header>


   <!-- Page Title
   ================================================== -->
   <section id="page-title">	
   	  
		<div class="row">

			<div class="twelve columns">

				<h1>Modulo Bus<span>.</span></h1>
				<p>Agrege,Elimine,modifique</p>

			</div>			    

		</div> <!-- /row -->	   

   </section> <!-- /page-title -->


   <!-- Content
   ================================================== -->
   <section id="content">
     <div class="row portfolio-content">
                   <form name="agregarbu" action="ModuloBus.jsp" method="post">
			<div class="row" align="center" >
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idBus"  placeholder="Id Numerico" size="35"/>
                     </div>
                     
               </div>
               <br/>
               <div class="row" align="center">
                      <input type="submit" value="AgregarDatos" name="boton8"/>
               </div>
                <div class="row" align="center">
    <%
        if (request.getParameter("boton8") != null)
        {
            String id=request.getParameter("idBus");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.agregarBus(id);
        out.println(""+result);
	if(result){
            %>
             <script>alert("Se Agrego correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Agregado");</script>
            <%
        }
    } catch (Exception ex) {
	out.println("errror");
    }
        }
    %>
    
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <hr/>
                     <input type="submit" value="EliminarBus" name="boton9"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarBus" placeholder="Id Numerico" size="35"/>
                     </div>
                      <div class="six columns mob-whole">    
    <%
        if (request.getParameter("boton9") != null)
        {
         String id =request.getParameter("eliminarBus");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	boolean result = port.eliminarBus(id);
        if(result){
            %>
             <script>alert("Se Elimino correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Elimino");</script>
            <%
        }
    } catch (Exception ex) {
	out.println("errror");
    }
        }
    %>
                  
                      </div>
                </div>   
    <div class="row" align="center" >
                 <h3>Modificacion.</h3>
                </div>    
                     <hr/>
    <div class="row" align="center" >
    <div class="six columns mob-whole">               	
                            <input type="text" name="idviego" class="eliminarAdmi" placeholder="Id Viejo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idnuev" class="eliminarAdmi" placeholder="Id Nuevo " size="35"/>
                     </div>
                     <div class="row" align="center" >
                    <div class="six columns mob-whole"> 
                      <input type="submit" value="Modificar Bus" name="boton22"/>
                        </div>
                     </div>
    <%
        if (request.getParameter("boton22") != null)
        {
            String iviejo=request.getParameter("idviego");
            String inuevo=request.getParameter("idnuev");
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	int idviejo = Integer.parseInt(iviejo);
	int idnuevo = Integer.parseInt(inuevo);
	// TODO process result here
	boolean result = port.modificarbus(idviejo, idnuevo);
	if(result){
            %>
             <script>alert("Se Modifico correctamante");</script>
            <%
        }else{
            %>
             <script>alert("Error No se Modifico");</script>
            <%
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    %>
    </div>
    
                   </form>
	   </div>
   	
   </section> <!-- /content -->  


   <!-- Footer
   ================================================== -->
   <footer>

      <div class="row">       

         <div class="six columns tab-whole footer-about">
				
				<h3>About Puremedia</h3>
               
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

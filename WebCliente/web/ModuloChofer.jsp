<%-- 
    Document   : MouduloChofer
    Created on : 19-sep-2015, 9:17:07
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
	<title>Modulo Chofer</title>
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
                    <li><a href="ModuloBus.jsp">Bus.</a></li>
	                <li class="current"><a href="ModuloChofer.jsp">Chofer.</a></li>
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

				<h1>Modulo Chofer<span>.</span></h1>
				<p>Agrege Elimine o Modifique</p>

			</div>			    

		</div> <!-- /row -->	   

   </section> <!-- /page-title -->


   <!-- Content
   ================================================== -->
   <section id="content">
     
   	<div class="row portfolio-content">
                  <form name="agregarech" action="ModuloChofer.jsp" method="post">
                 <div class="row" align="center" >
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idChofer"  placeholder="Id Numerico" size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="password" name="contraChofer"  placeholder="Password" size="35"/>
                     </div>
                     
               </div>
               <br/>
               <div class="row" align="center" >
                     <div class="six columns mob-whole">               	
                            <input type="text" name="nombreChofer"  placeholder="Nombre" size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="apellidoChofer"  placeholder="Apellido" size="35"/>
                     </div>
                      
               </div>
               <br/>
               <div class="row" align="center">  
                             <input type="submit" value="Agregar Datos" name="boton10"/> 
               </div>
               <div class="row" align="center">
                      <div class="six columns mob-whole"> 
    <%
        if (request.getParameter("boton10") != null)
        {
    try {
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
        String ids=request.getParameter("idChofer");
	int id = Integer.parseInt(ids);
	java.lang.String nombre = "nombreChofer";
	java.lang.String apellido = "apellidoChofer";
	java.lang.String contra = "contraChofer";
	// TODO process result here
	boolean result = port.agregarChofer(id, nombre, apellido, contra);
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
	// TODO handle custom exceptions here
    }
        }
    %>

                      </div>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <hr />           
                     <div class="six columns mob-whole">   
                     <input type="submit" value="EliminarChofer" name="boton11"/>
                     </div>
                     <div class="six columns mob-whole">   
                     <input type="text"  name="eliminarChofer" class="eliminarEstacionG"placeholder="Id Numerico" size="35" align="center" />
                     </div>
	             <div class="six columns mob-whole">  
    <%
         if (request.getParameter("boton11") != null)
        {
    try {
        
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
        String ids=request.getParameter("eliminarChofer");
	int id =Integer.parseInt(ids);
	// TODO process result here
	boolean result = port.eliminarChofer(id);
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
	// TODO handle custom exceptions here
    }
        }
    %>

                     </div>
	      </div> <!-- /nine -->
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

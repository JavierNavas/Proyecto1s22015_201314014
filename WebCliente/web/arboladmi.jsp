<%-- 
    Document   : arboladmi
    Created on : 19-sep-2015, 8:43:23
    Author     : javier
--%>
   


<%@page import="controles.Leer"%>
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
	<title>Arbol Administrador</title>
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
	            <li><a href="Graficos.jsp">InicioGrafico.</a></li>
                    <li  lass="current"><a href="arboladmi.jsp"> A Administrador.</a></li>
	            <li><a href="arbolestacionclave.jsp">A Estacion Clave.</a></li>
	            <li><a href="arbolestaciongeneral.jsp">A Estacion General.</a></li>
                    <li ><a href="ListaB.jsp">L Bus.</a></li>
	            <li ><a href="arbolchofer.jsp">A Chofer.</a></li>
                    <li ><a href="Inicio.jsp">Volver.</a></li>
   
	         </ul> 

	      </nav> <!-- /nav-wrap -->	      

	   </div> <!-- /header-inner -->

   </header>


   <!-- Page Title
   ================================================== -->
   <section id="page-title">	
   	  
		<div class="row">

			<div class="twelve columns">

				<h1>Arbol Administrador<span>.</span></h1>
				<p>La imagen de abajo es la estructura de administrador</p>

			</div>			    

		</div> <!-- /row -->	   

   </section> <!-- /page-title -->


   <!-- Content
   ================================================== -->
   <section id="content">
     <div class="row portfolio-content">
                   <form name="agregarbu" action="arboladmi.jsp" method="post">
                        <%
    try {
        String tipo="Administrador";
	transmetro.ControlTransmetro_Service service = new transmetro.ControlTransmetro_Service();
	transmetro.ControlTransmetro port = service.getControlTransmetroPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	java.lang.String result = port.obtenerDot(tipo);;
        Leer leer = new Leer();
        leer.generartxt(result);
        leer.generar();
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
    
    %>
			 <img src="http://localhost:8080/MY-APP/img/ArbolAdmi.jpg" width="1875" height="2847" alt="" name="imagen1" id="imagen1"/>
                
                   </form>
        </div>     
   	
   </section> <!-- /content -->  


   <!-- Footer
   <footer>
   ================================================== -->

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


   <script language="JavaScript" type="text/javascript" >
        periodo = 1;  // segundos entre recargas
        imgoImg=document.getElementById("imagen1");
        imgsrc = imgoImg.src;
        buffer = new Image();
        buffer.onload = imageChange;
        buffer.onerror = imageError;
        setTimeout("imageReload()", periodo * 1000);
       
        function imageReload() {
            buffer.src = imgsrc + "?d=" + new Date().getTime();
            setTimeout("imageReload()", periodo * 1000);
        }
       
        function imageChange() {
            imgoImg.src = buffer.src;
        }
     
        function imageError() {
            setTimeout("imageReload()", 1000);
        }
    </script>
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

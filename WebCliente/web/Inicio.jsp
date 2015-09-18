<%-- 
    Document   : index
    Created on : 27-ago-2015, 0:55:41
    Author     : javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en"> <!--<![endif]-->
<head>

   <!--- Basic Page Needs
   ================================================== -->
   <meta charset="utf-8">
	<title>Transmetro</title>
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

	<link rel="shortcut icon" href="muni.png" >

</head>

<body class="homepage">

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
	            <li class="current"><a class="smoothscroll" href="#hero">Inicio.</a></li>
		         <li><a class="smoothscroll" href="#portfolio">Administrador.</a></li>
	            <li><a class="smoothscroll" href="#services">Estacion Clave.</a></li>
	            <li><a class="smoothscroll" href="#about">Estacion General.</a></li>
	            <li><a class="smoothscroll" href="#journal">Bus.</a></li>	            
	            <li><a class="smoothscroll" href="#content">Chofer.</a></li>
                     <li><a class="smoothscroll" href="#contact">Ruta.</a></li>
	         </ul> 

	      </nav> <!-- /nav-wrap -->	      

	   </div> <!-- /header-inner -->

   </header> 


   <!-- Hero
   =================================================== -->
   <section id="hero">	
   	  
		<div class="row hero-content">

			<div class="twelve columns flex-container">

			   <div id="hero-slider" class="flexslider">

				   <ul class="slides">

					   <!-- Slide -->
					   <li>
						   <div class="flex-caption">
								<h1 >Hola Bienvenido a sistema de Buses Transmetro de la ciudad capital de Guatemala.</h1>	
																							   
							</div>						
					   </li>

					   <!-- Slide -->
					   <li>						
							<div class="flex-caption">
								<h1 >Aqui lograras mirar las estaciones generales principales y generales de la ciudad capital.</h1>	
																	   
							</div>					
					   </li>

					   <!-- Slide -->
					   <li>
						   <div class="flex-caption">
								<h1 >Aqui lograras registrar buses,choferes asi mismo la ruta que van a realizar cada uno.</h1>
																	   
							</div>
					   </li>					              

				   </ul>

			   </div> <!-- .flexslider -->				   

	      </div> <!-- .flex-container -->      

		</div> <!-- .hero-content -->	   

   </section> <!-- #hero -->


   <!-- Portfolio
   ================================================== -->
   <section id="portfolio">
       
       <div class="row form-section">
           <div id="contact-form" class="twelve columns">
                <div class="row" align="center" >
                    <h1>Modulo de Administrador</h1>
                    
                     <h3>Agregacion.</h3>
                    <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="correoAdmi" class="correoAdmi" placeholder="Correo Electronico " size="35"/>
                     </div>
                     <div class="six columns mob-whole">  
                            <input type="password"  name="contrAdmi" class="contrAdmi" placeholder="password" size="35"/>
                     </div>
               </div>
               <br/>
               <div class="row" align="center">
                      <input type="submit" value="Agregar Datos"/>
                     <div id="image-loader">
                        <img src="images/loader.gif" alt="">
                     </div>     
                     &nbsp
                      
                     
                  </div>
                <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                      <input type="submit" value="Eliminar Correo"/>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="eliminarAdmi" class="eliminarAdmi" placeholder="Correo Electronico " size="35"/>
                     </div>
        
                </div>
               
           </div>
       </div>  
      
   </section> <!-- /Portfolio -->


   <!-- Services Section
   ================================================== -->
   <section id="services">

   	<div class="row form-section">

   		<div id="contact-form" class="twelve columns">
                    
	        <div class="row" align="center" >
                    <h1>Modulo de Estacion Clave</h1>
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idEstacionC" class="idEstacionC" placeholder="Id Numerico " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="nombreEstacionC" class="nombreEstacionC" placeholder="Nombre" size="35"/>
                     </div>
                     
               </div>
               <br/>
               <div class="row" align="center" >
                            <input type="password" name="contraEstacionC" class="contraEstacionC" placeholder="Password" size="35"/>
               </div>
               <br/>
               <div class="row" align="center">
                      <input type="submit" value="Agregar Datos"/>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                      <input type="submit" value="Eliminar Estacion"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarEstacionC" class="eliminarEstacionC"placeholder="Id Numerico " size="35"/>
                     </div>
        
                </div>
         </div>

      </div>

      
   </section> <!-- /services -->   


   <!-- About Section
   ================================================== -->
   <section id="about" name="EstacionGeneral">
       
   	<div class="row form-section">

   		<div id="contact-form" class="twelve columns">
                    
	        <div class="row" align="center" >
                    <h1>Modulo de Estacion General</h1>
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idEstacionG" class="idEstacionG" placeholder="Id Numerico " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="nombreEstacionG" class="nombreEstacionG" placeholder="Nombre" size="35"/>
                     </div>
                     
               </div>
               <br/>
               <div class="row" align="center" >
                            <input type="password" name="contraEstacionG" class="contraEstacionG" placeholder="Password" size="35"/>
               </div>
               <br/>
               <div class="row" align="center">
                      <input type="submit" value="Agregar Datos"/>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                     <input type="submit" value="Eliminar Estacion"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarEstacionG" class="eliminarEstacionG"placeholder="Id Numerico" size="35"/>
                     </div>
        
                </div>
         </div>

      </div>

   </section> <!-- /about -->


   <!-- journal
   =================================================== -->
   <section id="journal">

	   <div class="row form-section">

	   	<div class="twelve columns">

			<div class="row" align="center" >
                    <h1>Modulo de Buses</h1>
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="idBus"  placeholder="Id Numerico" size="35"/>
                     </div>
                     
               </div>
               <br/>
               <div class="row" align="center">
                      <input type="submit" value="Agregar Datos"/>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                     <input type="submit" value="EliminarBus"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarBus" placeholder="Id Numerico" size="35"/>
                     </div>
        
                </div>         

		    </div>

	   </div>


   </section> <!-- /blog -->

   <section id="content">
      <br/>
      <div class="row form-section">

	   	<div class="twelve columns">

			<div class="row" align="center" >
                    <h1>Modulo de Choferes</h1>
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
                      <input type="submit" value="Agregar Datos"/>              
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <hr />           
                     <div class="six columns mob-whole">   
                     <input type="submit" value="EliminarChofer"/>
                     </div>
                     <div class="six columns mob-whole">   
                     <input type="text"  name="eliminarChofer" class="eliminarEstacionG"placeholder="Id Numerico" size="35" align="center" />
                     </div>
                 </div>

		    </div>

	   </div>
   </section>
   
   <!-- Contact Section
   ================================================== -->
   <section id="contact">
    <div class="row form-section">

                 <div class="twelve columns">

			<div class="row" align="center" >
                    <h1>Modulo de Rutas</h1>
                     <h3>Agregacion.</h3>
                     <hr />
                     <div class="six columns mob-whole">               	
                            <input type="text" name="NombreRuta"  placeholder="Nombre" size="35"/>
                     </div>
                     <div class="row" align="center">
                      <input type="submit" value="Agregar Datos"/>              
               </div>
               </div>


      </div>
   	
      

   </section>  <!-- /contact-->


  
   <!-- Footer
   ================================================== -->
   <footer>			
				<h3>Milton Navarro USAC</h3>
                              
  <img src="images/ArbolAdmi.jpg" width="1875" height="2847" alt="ArbolAdmi" name="imagen1" id="imagen1"/>

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

<%-- 
    Document   : index
    Created on : 27-ago-2015, 0:55:41
    Author     : javier
--%>
<%String dato= (String)request.getAttribute("mensaje2");
String error;
if(dato==null){
    error="";
}else{
    error=(String)request.getAttribute("mensaje2");
}

String dato1= (String)request.getAttribute("mensaje3");
String error2;
if(dato1==null){
    error2="";
}else{
    error2=(String)request.getAttribute("mensaje3");
     response.sendRedirect("chofer.jsp");
}

String dato2= (String)request.getAttribute("mensaje4");
String error3;
if(dato2==null){
    error3="";
}else{
    error3=(String)request.getAttribute("mensaje4");
}

String dato5= (String)request.getAttribute("mensaje5");
String error5;
if(dato5==null){
    error5="";
}else{
    error5=(String)request.getAttribute("mensaje5");
}

String dato6= (String)request.getAttribute("mensaje6");
String error6;
if(dato6==null){
    error6="";
}else{
    error6=(String)request.getAttribute("mensaje6");
}

String dato7= (String)request.getAttribute("mensaje7");
String error7;
if(dato7==null){
    error7="";
}else{
    error7=(String)request.getAttribute("mensaje7");
}
String dato8= (String)request.getAttribute("mensaje8");
String error8;
if(dato8==null){
    error8="";
}else{
    error8=(String)request.getAttribute("mensaje8");
}
String dato9= (String)request.getAttribute("mensaje9");
String error9;
if(dato9==null){
    error9="";
}else{
    error9=(String)request.getAttribute("mensaje9");
}
String dato10= (String)request.getAttribute("mensaje10");
String error10;
if(dato10==null){
    error10="";
}else{
    error10=(String)request.getAttribute("mensaje10");
}
%>
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
	            <li><a  href="ModuloBus.jsp">Bus.</a></li>	            
	            <li><a href="ModuloChofer.jsp">Chofer.</a></li>
                     <li><a href="ModuloRuta.jsp">Ruta.</a></li>
                      <li><a href="Login.jsp">Volver.</a></li>
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
						     <p><a class="button" href="AsignacionBus.jsp">Comienza asignar buses</a></p>														   
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
                                           <li>
						   <div class="flex-caption">
								<h1 >Presiona el boton y mira los graficos de las estructuras.</h1>
								 <p><a class="button" href="Graficos.jsp">Ingresar a Graficos</a></p>																   
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
               <form action="control.jsp" method="post" name="agr">
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
                      <input type="submit" value="Agregar Datos" name="boton1"/>    
                      <p><%=error %></p>
                  </div>
               
              
                <br/>
         <div class="row" align="center" >
                     
                     <h3>Eliminaciòn.</h3>
                     
                     <hr/>
                       <div class="row" align="center">
                     <div class="six columns mob-whole">               	
                            <input type="text" name="eliminarAdmi" class="eliminarAdmi" placeholder="Correo Electronico " size="35"/>
                     </div>
                              <div class="six columns mob-whole"> 
                      <input type="submit" value="Eliminar Correo" name="boton2"/>
                        </div>
                    </div>
                     <p><%=error2 %></p>
                </div>
                
                <div class="row" align="center" >
                 <h3>Modificacion.</h3>
                </div>    
                     <hr/>
                       <div class="row" align="center">
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarAdmi" class="eliminarAdmi" placeholder="Correo Electronico Antiguo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarAdmico" class="eliminarAdmi" placeholder="Correo Electronico nuevo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarcontra" class="eliminarAdmi" placeholder="Password nuevo " size="35"/>
                     </div>
                    <div class="six columns mob-whole"> 
                      <input type="submit" value="Modificar Admi" name="boton20"/>
                        </div>
    
                        <p><%=error8 %></p>
                           
                    </div>
      </form>
           </div>
       </div>  

   </section> <!-- /Portfolio -->


   <!-- Services Section
   ================================================== -->
   <section id="services">

   	<div class="row form-section">

   		<div id="contact-form" class="twelve columns">
                <form name="agregarec" action="control.jsp" method="post">
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
                      <input type="submit" value="Agregar Datos" name="boton3"/>
               </div>
               <div class="row" align="center">
               <p><%=error3 %></p>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                      <input type="submit" value="EliminarEstacion" name="boton4"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarEstacionC" class="eliminarEstacionC"placeholder="Id Numerico " size="35"/>
                     </div>
                 <p><%=error5 %></p>     
                </div>
                
                 <div class="row" align="center" >
                 <h3>Modificacion.</h3>
                </div>    
                     <hr/>
                       <div class="row" align="center">
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificaridantiguo" class="eliminarAdmi" placeholder="Id Antiguo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificaridnuevo" class="eliminarAdmi" placeholder="Id nuevo " size="35"/>
                     </div>
                      <div class="six columns mob-whole">               	
                            <input type="text" name="modificarnombre" class="eliminarAdmi" placeholder="nombre nuevo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarcontraest" class="eliminarAdmi" placeholder="Password nuevo " size="35"/>
                     </div>
                    <div class="six columns mob-whole"> 
                      <input type="submit" value="Modificar Estacion Clave" name="boton21"/>
                        </div>
    
                        <p><%=error9 %></p>
                           
                    </div>
               </form>
         </div>

      </div>

   </section> <!-- /services -->   


   <!-- About Section
   ================================================== -->
   <section id="about" name="EstacionGeneral">
       
   	<div class="row form-section">

   		<div id="contact-form" class="twelve columns">
                    <form name="agregareg" action="control.jsp" method="post">
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
                      <input type="submit" value="Agregar Datos" name="boton6"/>
               </div>
               <div class="row" align="center">
               <p><%=error6 %></p>
               </div>
               <br/>
                <div class="row" align="center" >
                     <h3>Eliminaciòn.</h3>
                     <HR NOSHADE>
                     <input type="submit" value="Eliminar Estacion" name="boton7"/>
                     <div class="six columns mob-whole">               	
                            <input type="text"  name="eliminarEstacionG" class="eliminarEstacionG"placeholder="Id Numerico" size="35"/>
                     </div>
                      <p><%=error7 %></p>
                </div>
                
                <div class="row" align="center" >
                 <h3>Modificacion.</h3>
                </div>    
                     <hr/>
                       <div class="row" align="center">
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarooooo" class="eliminarAdmi" placeholder="Id Antiguo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarppppp" class="eliminarAdmi" placeholder="Id nuevo " size="35"/>
                     </div>
                      <div class="six columns mob-whole">               	
                            <input type="text" name="modificarnnnn" class="eliminarAdmi" placeholder="nombre nuevo " size="35"/>
                     </div>
                     <div class="six columns mob-whole">               	
                            <input type="text" name="modificarcoccct" class="eliminarAdmi" placeholder="Password nuevo " size="35"/>
                     </div>
                    <div class="six columns mob-whole"> 
                      <input type="submit" value="Modificar Estacion General" name="boton22"/>
                        </div>
    
                        <p><%=error10 %></p>
                           
                    </div>
                    </form>
         </div>

      </div>

   </section> <!-- /about -->

  
   <!-- Footer
   ================================================== -->
   <footer>			
				<h3>Milton Navarro USAC</h3>
                              

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

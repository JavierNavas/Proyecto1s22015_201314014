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
	            <li><a class="smoothscroll" href="#journal">Chofer.</a></li>	            
	            <li><a class="smoothscroll" href="#contact">Bus.</a></li>
                     <li><a class="smoothscroll" href="#servicess">Ruta.</a></li>
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


   
    <section id="servicess">
       
   	<div class="row section-head">

   		<div class="twelve columns">

	         <h1>holllaaaa<span>.</span></h1>

	         <hr />

	         <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,
	         eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
	         voluptatem quia voluptas sit aspernatur aut odit aut fugit.
	         </p>

	      </div>

      </div>
   </section>
   <!-- journal
   =================================================== -->
   <section id="journal">

	   <div class="row section-head">

	   	<div class="twelve columns">

			   <h1>Chofer<span>.</span></h1>

			   <hr />

			   <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,
		       eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
		       voluptatem quia voluptas sit aspernatur aut odit aut fugit.
		      </p>	         

		    </div>

	   </div>


   </section> <!-- /blog -->

   
   <!-- Contact Section
   ================================================== -->
   <section id="contact">

   	<div class="row section-head">

   		<div class="twelve columns">

	         <h1>Get In Touch With Us<span>.</span></h1>

	         <hr />

	         <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam,
	         eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
	         voluptatem quia voluptas sit aspernatur aut odit aut fugit.
	         </p>

	      </div>

      </div>

      <div class="row form-section">
      	
      	<div id="contact-form" class="twelve columns">

            <form name="contactForm" id="contactForm" method="post" action="">

      			<fieldset>

                  <div class="row">

	                  <div class="six columns mob-whole">
	                  	<label for="contactFname">First Name <span class="required">*</span></label>	      						   
	      					<input name="contactFname" type="text" id="contactFname" placeholder="First Name" value="" />	      					
	                  </div>

	                  <div class="six columns mob-whole">	
	                  	<label for="contactLname">Last Name <span class="required">*</span></label>      						   
	      					<input name="contactLname" type="text" id="contactLname" placeholder="Last Name" value="" />	      					
	                  </div>	                        

                  </div>

                  <div class="row">

	                  <div class="six columns mob-whole">	
	                  	<label for="contactEmail">Email <span class="required">*</span></label>      						   
	      					<input name="contactEmail" type="text" id="contactEmail" placeholder="Email" value="" />	      					
	                  </div>

	                  <div class="six columns mob-whole">	 
	                  	<label for="contactSubject">Subject</label>     						   
	      					<input name="contactSubject" type="text" id="contactSubject" placeholder="Subject"  value="" />	      					
	                  </div>

                  </div>

                  <div class="row">

	                  <div class="twelve columns">
	                     <label  for="contactMessage">Message <span class="required">*</span></label>
	                     <textarea name="contactMessage"  id="contactMessage" placeholder="Your Message" rows="10" cols="50" ></textarea>
	                  </div>

                  </div>

                  <div>
                     <button class="submit full-width">Send Message</button>
                     <div id="image-loader">
                        <img src="images/loader.gif" alt="" />
                     </div>
                  </div>

      			</fieldset>
      				
      		</form> <!-- /contactForm -->

            <!-- message box -->
            <div id="message-warning"></div>
            <div id="message-success">
               <i class="fa fa-check"></i>Your message was sent, thank you!<br />
    			</div>

         </div> <!-- /contact-form -->      	

      </div> <!-- /form-section -->     

   </section>  <!-- /contact-->


  
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

         <div class="six columns tab-whole right-cols">

            <div class="row">

               <div class="columns">
                  <h3 class="address">Contact Us</h3>
                  <p>
                  1600 Amphitheatre Parkway<br>
                  Mountain View, CA<br>
                  94043 US
                  </p>

                  <ul>
                    <li><a href="tel:6473438234">647.343.8234</a></li>
                    <li><a href="tel:1234567890">123.456.7890</a></li>
                    <li><a href="mailto:someone@puremedia.com">someone@puremedia.com</a></li>
                  </ul>                  
               </div> <!-- /columns -->             

               <div class="columns last">
                  <h3 class="contact">Follow Us</h3>

                  <ul>
                     <li><a href="#">Facebook</a></li>
                     <li><a href="#">Twitter</a></li>
                     <li><a href="#">GooglePlus</a></li>
                     <li><a href="#">Instagram</a></li>
                     <li><a href="#">Flickr</a></li>
                     <li><a href="#">Skype</a></li>
                  </ul>
                  
               </div> <!-- /columns --> 

            </div> <!-- /Row(nested) -->

         </div>

         <p class="copyright">&copy; Copyright 2014 Puremedia. Design by <a href="http://www.styleshout.com/">Styleshout.</a></p>        

         <div id="go-top">
            <a class="smoothscroll" title="Back to Top" href="#hero"><span>Top</span><i class="fa fa-long-arrow-up"></i></a>
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

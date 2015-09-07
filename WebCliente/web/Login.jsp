<%-- 
    Document   : Login
    Created on : 27-ago-2015, 23:07:31
    Author     : javier
--%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Transmetro Guatemala</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>Bienvenido a Transmetro</h1>
            <form action="validar.jsp" method="post">
                <input type="text" name="username" class="username" placeholder="Id">
                <input type="password" name="password" class="password" placeholder="Contraseña">
                <br/>
                <br/>
                <br/>
                 <br/>
                <select name="combo" width="25">
                    <option>Administrador</option>
                    <option>Estacion Clave</option>
                    <option>Estacion General</option>
                    <option>Chofer</option>
                </select>
                  <br/>
                  <br/>
                   <br/>
                <button type="submit">Ingresar</button>
                <div class="error"><span>+</span></div>
                <br/>
                <br/>
                <br/>
                <label >HTML</label>
            </form>
            
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>
<%-- 
    Document   : about
    Created on : Apr 25, 2017, 11:14:31 AM
    Author     : Jake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@ include file="includes/nav.jsp" %>
        <%@ include file="includes/header.jsp" %>
    
    <div class="container">
        <div class="row">
            <div class="col-md-8 well">
                <h2>About Me</h2><br>
                <h4>Certifications:</h4>
                <p>BA Musical Theory from Cornell University focus in Musical Performance</p><br>
                <h4>Experience:</h4>
                <p>Conducted symphony orchestra in Vienna</p><br>
                <h4>Biography:</h4>
                <p>I grew up in blah blah</p><br>
                <h4>References:</h4>
                <p>John Smith (Previous Student): "He was really great, I learned a lot"</p><br>
                <img src="FullSizeRender.jpg.jpeg" alt="Team Photo" width="350" height="250">
            </div>
       </div>
    </div>
    </body>
</html>

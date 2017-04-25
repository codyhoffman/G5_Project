<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Music Teacher App</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        
        <%@ include file="includes/nav.jsp" %>
        <%@ include file="includes/header.jsp" %>
        
        <div class="container col-sm-12 col-sm-offset-4">
            <h1> Contact the Teacher</h1>
        <form>
            <div class="form-group" style="width: 25%;">
                <label for="name">Name:</label>
                <input type="name" class="form-control" id="name">
            </div>
            
            <div class="form-group" style="width: 25%;">
                <label for="email">Email address:</label>
                <input type="email" class="form-control" id="email">
            </div>
            
            <div class="form-group" style="width: 25%;">
                <label for="msg">Message:</label>
                <input type="message" class="form-control" id="msg">
            </div>
            <div style="margin-right: 0;">
                <button type="submit" class="btn btn-default">Submit</button>
                <button type="reset" class="btn btn-default ">Clear</button>
            </div>
        </form>
        </div>
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>

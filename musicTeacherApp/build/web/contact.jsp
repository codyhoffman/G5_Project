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
                <label for="email">Email address:</label>
                <input type="email" class="form-control" id="email">
            </div>
            <div class="form-group" style="width: 25%;">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd">
            </div>

            <button type="submit" class="btn btn-default">Submit</button>
        </form>
        </div>
    </body>
</html>

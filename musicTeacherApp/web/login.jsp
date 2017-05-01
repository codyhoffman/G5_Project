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
    
    <div class="container-fluid">
        <ul>
            <li><a href="smallRead">List Students</a></li>
            <li><a href="add">Add a Student</a></li>
        </ul>
    </div>
    
    <%@ include file="includes/footer.jsp" %>
</body>
</html>

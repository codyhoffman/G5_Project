<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Search Students</title>
    </head>
    <body>
        
        <%@ include file="includes/nav.jsp" %>
    <%@ include file="includes/header.jsp" %>
    
        <div class="container">
            
        <h1>Search Students</h1>
        
        <form name="searchForm" action="search" method="post">
            
            <input type="text" name="searchVal" value="" />
            
            <br><br>
            
            <input type="submit" name="submit" value="Search" />
                   
                   
        </form>
        
        </div><!--container-->
        
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>


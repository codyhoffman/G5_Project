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
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    
    <body>
        <%@ include file="includes/nav.jsp" %>
        <%@ include file="includes/header.jsp" %>
        <div class="container-fluid">
        <div class="col-sm-12 col-sm-offset-4">
            
            
            <h1>Search Students</h1>
            <form name="searchForm" action="search" method="post">
            <table >
                <tbody>
                    
                    <tr>
                        <td><input type="text" name="searchVal" value="" size="50"></td>
                    </tr>
                    
                </tbody>
            </table>
                <input type="submit" name="submit" value="Search">
            </form>
        
        </div>
        </div>
            
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>

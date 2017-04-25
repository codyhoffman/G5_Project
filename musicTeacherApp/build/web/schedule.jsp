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
            <h1>Teacher's Schedule</h1>
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-hover"> 
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Name</th>
                            <th>Lesson Type</th>
                            <th>Level</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                          <td>3:30</td>
                          <td>Cody</td>
                          <td>Piano</td>
                          <td>2</td>
                        </tr>
                        <tr>
                          <td>4:00</td>
                          <td>Jake</td>
                          <td>Voice</td>
                          <td>3</td>
                        </tr>
                        <tr>
                          <td>4:30</td>
                          <td>Bailey</td>
                          <td>Voice</td>
                          <td>4</td>
                        </tr>
                        <tr>
                          <td>5:00</td>
                          <td>Avery</td>
                          <td>Piano</td>
                          <td>1</td>
                        </tr>
                        <tr>
                          <td>5:30</td>
                          <td>Open</td>
                          <td>Open</td>
                          <td>Open</td>
                        </tr>
                        <tr>
                          <td>6:00</td>
                          <td>Sam</td>
                          <td>Piano</td>
                          <td>4</td>
                        </tr>
                        <tr>
                          <td>6:30</td>
                          <td>Jordan</td>
                          <td>Piano</td>
                          <td>1</td>
                        </tr>
                        <tr>
                          <td>7:00</td>
                          <td>Mike</td>
                          <td>Voice</td>
                          <td>3</td>
                        </tr>
                        <tr>
                          <td>7:30</td>
                          <td>Bridget</td>
                          <td>Piano</td>
                          <td>3</td>
                        </tr>
                        <tr>
                          <td>8:00</td>
                          <td>Kelsey</td>
                          <td>Voice</td>
                          <td>2</td>
                        </tr>
                        <tr>
                          <td>8:30</td>
                          <td>Open</td>
                          <td>Open</td>
                          <td>Open</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>

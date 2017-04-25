<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Add Student</title>
    </head>
    <body>
        
        <%@ include file="includes/nav.jsp" %>
    <%@ include file="includes/header.jsp" %>
    
        <div class="container">
            
        <h1>Add A Students</h1>
        
        <form name="addForm" action="addStudent" method="post">
            <table class="add">
                <tbody>
                    
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="Address" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>State:</td>
                        <td><input type="text" name="studentState" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Zip:</td>
                        <td><input type="text" name="zip" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Phone:</td>
                        <td><input type="text" name="phone" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Gender:</td>
                        <td><input type="text" name="Gender" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Type:</td>
                        <td><input type="text" name="type" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Level:</td>
                        <td><input type="text" name="level" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Time:</td>
                        <td><input type="text" name="timeSlot" value="" size="50"></td>
                    </tr>
                    
                    
                </tbody>
            </table>
            
            <br><br>
            
            <input type="reset" value="Clear" id="clear">
                    <input type="submit" value="Add" id="add">
            
            
        </form>
        
        </div><!--container-->
        
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>


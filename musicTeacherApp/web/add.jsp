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
    
        <div class="container-fluid">
        <div class="col-sm-12 col-sm-offset-4">
            
        <h1>Add A Student</h1>
        
        <form name="AddForm" action="addStudent" method="post">
            <table class="add">
                <tbody>
                    
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="studentName" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="address" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>City:</td>
                        <td><input type="text" name="city" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>State:</td>
                        <td><input type="text" name="studentState" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Zip:</td>
                        <td><input type="text" name="zipcode" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Phone:</td>
                        <td><input type="text" name="phoneNo" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Email Address:</td>
                        <td><input type="text" name="studentEmail" value="" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Gender:</td>
                        <td>
                      
                                <label class="radio-inline"><input type="radio" name="gender" value="Male">Male</label>
                                <label class="radio-inline"><input type="radio" name="gender" value="Female">Female</label>
                  
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Type:</td>
                        <td>
                            <label class="checkbox-inline"><input type="checkbox" name="lessonType" value="Voice">Voice</label>
                            <label class="checkbox-inline"><input type="checkbox" name="lessonType" value="Piano">Piano</label>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Level:</td>
                        <td>                                                    
                            
                            <div class="form-group">
                            <label for="courseLevel"></label>
                            <select class="form-control" id="courseLevel" name="courseLevel">
                              <option value=""> </option>
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                            </select>
                            </div>
                            
                        </td>
                    </tr>
                    
                    
                </tbody>
            </table>
            
            <br><br>
           
            <input type="submit" name="submit" value="Add">
            
            
        </form>
        
        </div>
        </div><!--container-->
        
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>


<%-- 
    Document   : updateForm
    Created on : Apr 30, 2017, 9:08:04 PM
    Author     : Jake
--%>

<%@page import="model.Students"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Students student = (Students) request.getAttribute("student"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Update Student</title>
    </head>
    <body>
        <%@ include file="includes/nav.jsp" %>
    <%@ include file="includes/header.jsp" %>
    
        <div class="container">
            
        <h1>Update Student</h1>
        
        <form name="updateForm" action="updateStudent" method="post">
            <table class="update">
                <tbody>
                    
                    <tr>
                        <td>StudentID:</td>
                        <td><input type="text" name="studentID" value="<%= student.getStudentID() %>" readonly size="50"/></td>
                    </tr>
                    
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="studentName" value="<%= student.getStudentName() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="address" value="<%= student.getAddress() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>City:</td>
                        <td><input type="text" name="city" value="<%= student.getCity() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>State:</td>
                        <td><input type="text" name="studentState" value="<%= student.getState() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Zip:</td>
                        <td><input type="text" name="zipcode" value="<%= student.getZip() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Phone:</td>
                        <td><input type="text" name="phoneNo" value="<%= student.getPhoneNo() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="studentEmail" value="<%= student.getEmailAddr() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Gender:</td>
                        <td><input type="text" name="gender" value="<%= student.getGender() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Type:</td>
                        <td><input type="text" name="lessonType" value="<%= student.getTypeOfLesson() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Level:</td>
                        <td><input type="text" name="courseLevel" value="<%= student.getCourseLevel() %>" size="50"></td>
                    </tr>
                    
                    <tr>
                        <td>Time:</td>
                        <td><input type="text" name="timeSlot" value="<%= student.getTimeSlot() %>" size="50"></td>
                    </tr>
                    
                    
                </tbody>
            </table>
            
            <br><br>
            
            <input type="reset" value="Clear" name="reset">
                    <input type="submit" value="Update" name="submit">
            
            
        </form>
        
        </div><!--container-->
        
        
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>

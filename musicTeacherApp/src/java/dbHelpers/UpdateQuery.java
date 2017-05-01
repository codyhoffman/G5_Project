/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Students;

/**
 *
 * @author Jake
 */
public class UpdateQuery {
    private Connection conn;
    
    public UpdateQuery(){
     Properties propa= new Properties();
       InputStream instr=getClass().getResourceAsStream("dbConn.properties");
        try {
            propa.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       String driver= propa.getProperty("driver.name");
       String url= propa.getProperty("server.name");
       String username= propa.getProperty("user.name");
       String passwd= propa.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
    public void doUpdate(Students student){
        
        try {
            String query = "UPDATE students SET studentName = ?, Address = ?, City = ?, StudentState = ?, Zipcode = ?, PhoneNo = ?, StudentEmail = ?, TimeSlot = ?, LessonType = ?, CourseLevel = ?, Gender = ? WHERE studentID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getAddress());
            ps.setString(3, student.getCity());
            ps.setString(4, student.getState());
            ps.setInt(5, student.getZip());
            ps.setString(6, student.getPhoneNo());
            ps.setString(7, student.getEmailAddr());
            ps.setString(8, student.getTimeSlot());
            ps.setString(9, student.getTypeOfLesson());
            ps.setInt(10, student.getCourseLevel());
            ps.setString(11, student.getGender());
            ps.setInt(12, student.getStudentID());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

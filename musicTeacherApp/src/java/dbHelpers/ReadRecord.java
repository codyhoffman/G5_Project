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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Students;

/**
 *
 * @author baileykrebs
 */
public class ReadRecord {
    
    
    private Connection conn;
    private ResultSet results;
    
    private Students student= new Students();
    private int studentID;
    
    
    public ReadRecord (int studentID) {
    
    Properties propa= new Properties();
       InputStream instr=getClass().getResourceAsStream("dbConn.properties");
        try {
            propa.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       String driver= propa.getProperty("driver.name");
       String url= propa.getProperty("server.name");
       String username= propa.getProperty("user.name");
       String passwd= propa.getProperty("user.password");
       
       this.studentID=studentID;
       
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
    
    public void doRead() {
    
        try {
            //set up a string to hold our query
            String query= "SELECT * FROM students WHERE studentID = ?";
            
            //create a preparedStatement using query
            
            PreparedStatement ps= conn.prepareStatement(query);
            
            //fill in the preparedStatement
            
            ps.setInt(1, studentID);
            
            //execute the query
            
            this.results=ps.executeQuery();
            
            this.results.next();
            
            
                student.setStudentID(this.results.getInt("studentID"));
                student.setStudentName(this.results.getString("studentName"));
                student.setAddress(this.results.getString("address"));
                student.setCity(this.results.getString("city"));
                student.setState(this.results.getString("studentState"));
                student.setZip(this.results.getInt("zipcode"));
                student.setPhoneNo(this.results.getString("phoneNo"));
                student.setEmailAddr(this.results.getString("studentEmail"));
                student.setTimeSlot(this.results.getString("timeSlot"));
                student.setTypeOfLesson(this.results.getString("lessonType"));
                student.setCourseLevel(this.results.getInt("courseLevel"));
                student.setGender(this.results.getString("gender"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
}
    
    public Students getStudent(){
        
        return this.student;
        
    }
    
}
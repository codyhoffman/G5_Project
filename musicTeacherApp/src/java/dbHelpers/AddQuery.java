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
 * @author codyhoffman
 */
public class AddQuery {
    
    private Connection conn;
    
    public AddQuery(){
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void doAdd(Students student) {
        try {
            String query = "INSERT INTO students (studentName, address, city, studentState, zipcode, phoneNo, studentEmail, timeSlot, lessonType, courseLevel, gender) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
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
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

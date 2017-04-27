

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

public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery () {
        
       Properties propa= new Properties();
       InputStream instr=getClass().getResourceAsStream("dbConn.properties");
        try {
            propa.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       String driver= propa.getProperty("driver.name");
       String url= propa.getProperty("server.name");
       String username= propa.getProperty("user.name");
       String passwd= propa.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
        
        try {
            String query= "Select * FROM students ORDER BY studentID ASC";
            
            PreparedStatement ps= conn.prepareStatement(query);
            this.results=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getHTMLtable(){
        
            String table="";
            table += "<table class=read>";
            
            table +="<tr id=topRow>";
               
                table+="<th>";
                    table+="ID";
                table+="</th>";
                
                table+="<th>";
                    table+="Name";
                table+="</th>";
                
                table+="<th>";
                    table+="Address";
                table+="</th>";
                
                table+="<th>";
                    table+="City";
                table+="</th>";
                
                table+="<th>";
                    table+="State";
                table+="</th>";
                
                table+="<th>";
                table+="Zipcode";
                table+="</th>";
                
                table+="<th>";
                    table+="Phone Number";
                table+="</th>";
                
                table+="<th>";
                    table+="Email";
                table+="</th>";
                
                table+="<th>";
                    table+="Time";
                table+="</th>";
                
                table+="<th>";
                table+="Lesson Type";
                table+="</th>";
                
                table+="<th>";
                    table+="Level";
                table+="</th>";
                
                table+="<th>";
                    table+="Gender";
                table+="</th>";
                
             
                    
               table +="</tr>";
            
         try {   
            while(this.results.next()){
                
                Students student=new Students();
                student.setStudentID(this.results.getInt("studentID"));
                student.setStudentName(this.results.getString("stuentName"));
                student.setAddress(this.results.getString("address"));
                student.setCity(this.results.getString("city"));
                student.setState(this.results.getString("state"));
                student.setZip(this.results.getInt("zipcode"));
                student.setPhoneNumber(this.results.getInt("phoneNo"));
                student.setEmailAddr(this.results.getString("Email"));
                student.setTimeSlot(this.results.getString("timeSlot"));
                student.setTypeOfLesson(this.results.getString("lesson"));
                student.setCourseLevel(this.results.getInt("courseLevel"));
                student.setGender(this.results.getString("gender"));
                
                
                
               
               
                table += "<tr>";
                
                       
                    table += "<td>";
                        table += student.getStudentID();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getStudentName();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getAddress();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getCity();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getState();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getZip();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getPhoneNumber();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getEmailAddr();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getTimeSlot();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getTypeOfLesson();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getCourseLevel();  
                    table +="</td>";
                    
                    table += "<td>";
                        table += student.getGender();  
                    table +="</td>";
                    
                    
                    table+="<td>";
                        table +="<a href=update?studentID="+ student.getStudentID()+"> Update</a>" 
                                + "<a href=delete?studentID=" + student.getStudentID() + "> Delete </a>";
                        
                    table +="</td>";           
                
                table +="</tr>";
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        table +="</table>";
            return table;
        
    }
    
}

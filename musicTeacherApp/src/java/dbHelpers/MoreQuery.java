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

public class MoreQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public MoreQuery () {
        
       Properties propa= new Properties();
       InputStream instr=getClass().getResourceAsStream("dbConn.properties");
        try {
            propa.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       String driver= propa.getProperty("driver.name");
       String url= propa.getProperty("server.name");
       String username= propa.getProperty("user.name");
       String passwd= propa.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doMore(int studentID){
        
        try {
            String query = "SELECT * FROM Students WHERE studentID LIKE ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, studentID);
            
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getHTMLtable(){
        
            String table="";
            table += "<table class='table table-striped table-bordered table-hover'>";
            table += "<thead>";
            table +="<tr>";
               
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
               table += "</thead>";
               table += "<tbody>";
         try {   
            while(this.results.next()){
                
                Students student = new Students();
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
                        table += student.getPhoneNo();  
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
                              
                    table += "<td>";
                        table += "<a href=update?studentID=" + student.getStudentID() + "> Update </a>" + " " + "<a href=delete?studentID=" + student.getStudentID() + "> Delete </a>";
                    table += "</td>";
                
                table +="</tr>";
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MoreQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        table += "</tbody>";
        table +="</table>";
        return table;
        
    }
}

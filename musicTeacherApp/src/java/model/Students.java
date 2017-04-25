
package model;

public class Students {
    private int studentID;
    private String studentName;
    private String address;
    private int zip;
    private String city;
    private String studentState;
    private int phoneNumber;
    private String emailAddr;
    private String typeOfLesson;
    private String gender;
    private int timeSlot;
    private int courseLevel;

    public Students() {
        this.studentID = 0;
        this.studentName = "";
        this.address = "";
        this.zip = 0;
        this.city = "";
        this.studentState = "";
        this.phoneNumber = 0;
        this.emailAddr = "";
        this.typeOfLesson = "";
        this.gender = "";
        this.timeSlot = 0;
        this.courseLevel = 0;

    }
    
     public Students(int studentID, String studentName, String address, int zip, String city, String studentState, int phoneNumber, String emailAddr, String typeOfLesson, String gender, int timeSlot, int courseLevel) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.studentState = studentState;
        this.phoneNumber = phoneNumber;
        this.emailAddr = emailAddr;
        this.typeOfLesson = typeOfLesson;
        this.gender = gender;
        this.timeSlot = timeSlot;
        this.courseLevel = courseLevel;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return studentState;
    }

    public void setState(String studentState) {
        this.studentState = studentState;
    }
    
     public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }
    
    public String getTypeOfLesson() {
        return typeOfLesson;
    }

    public void setTypeOfLesson(String typeOfLesson) {
        this.typeOfLesson = typeOfLesson;
    }
    
     public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
     public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }
    
     public int getCourseLevel() {
        return timeSlot;
    }

    public void setCourseLevel(int courseLevel) {
        this.courseLevel = courseLevel;
    }
    
    @Override
    public String toString() {
        return "Friends{" + "studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + ", zip=" + zip + ", city=" + city + ", studentState=" + studentState + ", phoneNumber=" + phoneNumber +", emailAddr=" + emailAddr + ", gender=" + gender + ", timeSlot=" + timeSlot + ", courseLevel=" + courseLevel + '}';
    }
       
    
}
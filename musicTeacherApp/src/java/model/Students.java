
package model;

public class Students {
    private int studentID;
    private String studentName;
    private String address;
    private int zip;
    private String city;
    private String studentState;
    private String phoneNo;
    private String emailAddr;
    private String typeOfLesson;
    private String gender;
    private String timeSlot;
    private int courseLevel;

    public Students() {
        this.studentID = 0;
        this.studentName = "";
        this.address = "";
        this.zip = 0;
        this.city = "";
        this.studentState = "";
        this.phoneNo = "";
        this.emailAddr = "";
        this.typeOfLesson = "";
        this.gender = "";
        this.timeSlot = "";
        this.courseLevel = 0;

    }
    
     public Students(int studentID, String studentName, String address, int zip, String city, String studentState, String phoneNo, String emailAddr, String typeOfLesson, String gender, String timeSlot, int courseLevel) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.studentState = studentState;
        this.phoneNo = phoneNo;
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
    
     public String getPhoneNo() {
        return phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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
    
     public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
     public int getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(int courseLevel) {
        this.courseLevel = courseLevel;
    }
    
    @Override
    public String toString() {
        return "Students{" + "studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + ", zip=" + zip + ", city=" + city + ", studentState=" + studentState + ", phoneNo=" + phoneNo +", emailAddr=" + emailAddr + ", gender=" + gender + ", timeSlot=" + timeSlot + ", courseLevel=" + courseLevel + '}';
    }
       
    
}

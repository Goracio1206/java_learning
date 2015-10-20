package Chapter3.Classes;


import java.util.Date;

/**
 * Created by Vitalii.Nedzelskyi on 13.10.2015.
 */
public class Student {

    private static int id;
    private final int studentId;
    private String secondName;
    private String firstName;
    private String serName;
    private Date birthday;
    private String address;
    private long phone;
    private String facultet;
    private String course;
    private String group;


    private void id() {
      id = ++id;
    }

    public int getStudentId() {
        return studentId;
    }
    public Student() {
        studentId = 0;
    }

    public Student(String address, Date birthday, String course, String facultet, String firstName, String group, long phone, String secondName, String serName) {
        id();
        this.studentId = id;
        this.address = address;
        this.birthday = birthday;
        this.course = course;
        this.facultet = facultet;
        this.firstName = firstName;
        this.group = group;
        this.phone = phone;
        this.secondName = secondName;
        this.serName = serName;
    }


    public void setBirthday(Date date) {
        birthday = date;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    @Override
    public String toString() {
        return "Student id: " + this.studentId + "\n"
                + "Student name: " + firstName + " " + secondName + " " + serName + "\n"
                + "Birthday " +  birthday + "\n";
    }
}

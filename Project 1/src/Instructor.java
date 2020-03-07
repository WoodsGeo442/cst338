//Title: Instructor.java
//Abstract: This program functions like a school record system and will keep track of classes, teachers and students.
//Author: Geoffrey Woods
//3/6/2020

import java.util.ArrayList;

public class Instructor{
    String name;
    int teacherNum;
    String email;
    String teacherPhone;
    private ArrayList<Course> teachCourses = new ArrayList<>();

    public Instructor(String name, int teacherNum, String email, String teacherPhone){
        this.name = name;
        this.teacherNum = teacherNum;
        this.email = email;
        this.teacherPhone = teacherPhone;
    }

    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherNum() {
        return this.teacherNum;
    }

    public void setTeacherNum(int teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeacherPhone() {
        return this.teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public void addCourse(Course num){
        teachCourses.add(num);
    }

    public void getCourses(){
        for(int i = 0; i < teachCourses.size(); i++){

        }
    }

    @Override
    public String toString(){
        String newString = "";
        newString += "Instructor Number: " + teacherNum + "\n" + "Name: " + name + "\nCourses Enrolled: \n";
        for (Course classes: teachCourses) {
            newString += classes.getCourseNum() + ": " + classes.getTotalEnrolled() + " enrolled" + "\n";
        }
        return newString;
    }

    
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class School
{
    String name;
    HashMap<Integer, Course>Courses;
    HashMap<Integer, Student>Students;
    HashMap<Integer, Instructor>Instructors;

    School(String name){
        this.name = name;
    }
    void readData(String fileName){
        Scanner scanner = null;
        String num;
        String line;
        String instructorLine [];
        String courseLine[];
        String studentLine[];
        File f = new File(fileName);
        try{
            scanner = new Scanner(f);
        } catch (FileNotFoundException e){
            System.out.println("Error opening file" + e);
            e.printStackTrace();
        }

        while(scanner != null && scanner.hasNext()){
            //add teacher
            num = scanner.nextLine();
            int numInstructors = Integer.parseInt(num);
            for(int i = 0; i < numInstructors; i++){
                line = scanner.nextLine();
                instructorLine = line.split(",");
                Integer instructorID = Integer.parseInt(instructorLine[0]);
                Instructor newInstructor = new Instructor(instructorLine[1], instructorID, instructorLine[2], instructorLine[3]);
                Instructors.put(instructorID, newInstructor);
            }
            //add course
            num = scanner.nextLine();
            int numInstructors = Integer.parseInt(num);
            for(int i = 0; i < numInstructors; i++){
                line = scanner.nextLine();
                instructorLine = line.split(",");
                Integer instructorID = Integer.parseInt(instructorLine[0]);
                Instructor newInstructor = new Instructor(instructorLine[1], instructorID, instructorLine[2], instructorLine[3]);
                Instructors.put(instructorID, newInstructor);
            }
            //add student
            num = scanner.nextLine();
            int numInstructors = Integer.parseInt(num);
            for(int i = 0; i < numInstructors; i++){
                line = scanner.nextLine();
                instructorLine = line.split(",");
                Integer instructorID = Integer.parseInt(instructorLine[0]);
                Instructor newInstructor = new Instructor(instructorLine[1], instructorID, instructorLine[2], instructorLine[3]);
                Instructors.put(instructorID, newInstructor);
            }
        }
        

    }

    void addInstructor(int ID, String name, String email, String phone){
        Instructor newInstructor = new Instructor(name, ID, email, phone);
        Instructors.put(ID, newInstructor);
    }
    
    void addCourse(int courseNum, String courseName, int studentCount, String location){
        Course newCourse = new Course(courseNum, courseName, studentCount, location);
        Courses.put(courseNum, newCourse);
    }

    void addStudent(int studentID, String studentName){

    }

    void assignInstructor (int courseNum, int TeacherNum){

    }

    void register(int courseNum,int studentID){

    }

    void putScore(int courseNum, int studentID, double studentScore){

    }

    void unRegister(int courseNum, int studentID){

    }

    void courseInfo(int courseNum){

    }

    void courseInfo(){

    }

    void deleteCourse(int courseNum){

    }

    void schoolInfo(){

    }

    void searchByEmail(String email){

    }

    void getCourse(int courseNum){

    }

    void getInstructor(int TeacherNum){

    }

    void getStudent(int studentID){

    }

    void graduateStudent(int studentID){

    }

    
}
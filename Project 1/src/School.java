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
        Courses = new HashMap<>();
        Students = new HashMap<>();
        Instructors = new HashMap<>();
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
                if(Instructors.containsKey(instructorID)){
                    System.out.println("Instructor info reading failed – Employee number " + instructorID + " already used.");
                } else {
                    Instructor newInstructor = new Instructor(instructorLine[1], instructorID, instructorLine[2], instructorLine[3]);
                    Instructors.put(instructorID, newInstructor);
                }
                
            }
            //add course
            num = scanner.nextLine();
            int numCourses = Integer.parseInt(num);
            for(int i = 0; i < numCourses; i++){
                line = scanner.nextLine();
                courseLine = line.split(",");
                Integer courseID = Integer.parseInt(courseLine[0]);
                if(Courses.containsKey(courseID)){
                    System.out.println("Course info reading failed – Course ID " + courseID + " already used");
                }else {
                    Integer courseStudents = Integer.parseInt(courseLine[2]);
                    Course newCourse = new Course(courseID, courseLine[1], courseStudents, courseLine[3]);
                    Courses.put(courseID, newCourse);
                }
                
            }
            //add student
            num = scanner.nextLine();
            int numStudents = Integer.parseInt(num);
            for(int i = 0; i < numStudents; i++){
                line = scanner.nextLine();
                studentLine = line.split(",");
                Integer studentID = Integer.parseInt(studentLine[0]);
                if(Students.containsKey(studentID)){
                    System.out.println("Student info reading failed - Student ID " + studentID + " already used");
                } else {
                    Student newStudent = new Student(studentID, studentLine[1]);
                    Students.put(studentID, newStudent);
                }
                
            }
        }
        
        System.out.println("Done.");
    }

    void schoolInfo(){
        System.out.println("School Name: " + name);
        System.out.println("Instructor Information");
        for (Instructor teacher : Instructors.values()) {
            System.out.println(teacher.getName());
        }
        System.out.println("Course Information");
        for (Course classes : Courses.values()) {
            System.out.println(classes.getCourseTitle());
        }
        System.out.println("Student Information");
        for (Student people : Students.values()) {
            System.out.println(people.getStudentName());
        }
    }

    void searchByEmail(String email){
        boolean correct = false;
        System.out.print("Search key: ");
        System.out.println(email);
        for (Instructor teacher : Instructors.values()) {
            if(teacher.getEmail().equals(email)){
                correct = true;
                System.out.print("Employee Number: ");
                System.out.println(teacher.getTeacherNum());
                System.out.print("Name: ");
                System.out.println(teacher.getName());
                System.out.print("Phone: ");
                System.out.println(teacher.getTeacherPhone());
            }
        }
        if(correct == false){
            System.out.println("No employee with email " + email);
        }
    }

    void addInstructor(int ID, String name, String email, String phone){
        Instructor newInstructor = new Instructor(name, ID, email, phone);
        if(Instructors.containsKey(ID)){
            System.out.println("Instructor Assignment failed – Employee number" + " already used.");
        } else {
            Instructors.put(ID, newInstructor);
        }
        
    }
    
    void addCourse(int courseNum, String courseName, int studentCount, String location){
        Course newCourse = new Course(courseNum, courseName, studentCount, location);
        if(Courses.containsKey(courseNum)){
            System.out.println("Course addition failed – Course number " + courseNum + " already used.");
        } else {
            Courses.put(courseNum, newCourse);
        }
        
    }

    void addStudent(int studentID, String studentName){
        Student newStudent = new Student(studentID, studentName);
        if(Students.containsKey(studentID)){
            System.out.println("Student info addition failed - Student ID " + studentID + " already used.");
        } else {
            Students.put(studentID, newStudent);
        }
        Students.put(studentID, newStudent);

    }

    Course getCourse(int courseNum){
        if(Courses.containsKey(courseNum)){
            return Courses.get(courseNum);
        } else{
            System.out.println("Course " + courseNum + " does not exist.");
            return null;
        }
    }

    void assignInstructor (int courseNum, int TeacherNum){
        boolean teacherTruth = false;
        boolean courseTruth = false;
        if(Courses.containsKey(courseNum)){
            courseTruth = true;
        } else {
            System.out.println("Course " + courseNum + " does not exist.");
        }
        if(Instructors.containsKey(TeacherNum)){
            teacherTruth = true;
        } else { 
            System.out.println("Instructor " + TeacherNum + " does not exist.");
        }
        if (teacherTruth == true && courseTruth == true){
            Instructors.get(TeacherNum).addCourse(courseNum);
            Courses.get(courseNum).setInstructorID(TeacherNum);
        } 
        
        
    }

    void register(int courseNum,int studentID){
        boolean studentTruth = false;
        boolean courseTruth = false;
        if(Courses.containsKey(courseNum)){
            courseTruth = true;
        } else {
            System.out.println("Course " + courseNum + " does not exist.");
        }
        if(Students.containsKey(studentID)){
            studentTruth = true;
        } else { 
            System.out.println("Student " + studentID + " does not exist.");
        }
        if (studentTruth == true && courseTruth == true){
            Students.get(studentID).addClass(courseNum);
            Courses.get(courseNum).addStudent(studentID);
        } 
    }

    void putScore(int courseNum, int studentID, double studentScore){
        boolean courseTruth = false;
        boolean studentTruth = false;
        if(Courses.containsKey(courseNum)){
            courseTruth = true;
        } else {
            System.out.println("Course " + courseNum + " does not exist.");
        }
        if(Students.containsKey(studentID)){
            studentTruth = true;
        } else { 
            System.out.println("Student " + studentID + " does not exist.");
        }
        if (studentTruth == true && courseTruth == true){
            if(Students.get(studentID).takingCourse(courseNum)){
                Students.get(studentID).addScores(courseNum, studentScore);
                Courses.get(courseNum).addScores(studentID, studentScore);
            }
            
        }

    }

    void unRegister(int courseNum, int studentID){
        boolean courseTruth = false;
        boolean studentTruth = false;
        if(Courses.containsKey(courseNum)){
            courseTruth = true;
        } else {
            System.out.println("Course " + courseNum + " does not exist.");
        }
        if(Students.containsKey(studentID)){
            studentTruth = true;
        } else { 
            System.out.println("Student " + studentID + " does not exist.");
        }
        if (studentTruth == true && courseTruth == true){
            if(Students.get(studentID).takingCourse(courseNum)){
                Students.get(studentID).removeStudent(courseNum);
                Courses.get(courseNum).removeStudent(studentID);
            }
        }
    }

    void courseInfo(int courseNum){
        boolean courseTruth = false;
        if(Courses.containsKey(courseNum)){
            courseTruth = true;
        } else {
            System.out.println("Course " + courseNum + " does not exist.");
        }

        if(courseTruth == true){
            System.out.println("Course Number: " + Courses.get(courseNum).getCourseNum());
            System.out.println("Instructor: " + Instructors.get(Courses.get(courseNum).getInstructorID()).getName());
            System.out.println("Course Title: " + Courses.get(courseNum).getCourseTitle());
            System.out.println("Room: " + Courses.get(courseNum).getCourseLocation());
            System.out.println("Total Enrolled: " + Courses.get(courseNum).getTotalEnrolled());
            System.out.println("Course Average: " + Courses.get(courseNum).getAverageScores());
        }
        
    }

    void courseInfo(){
        
    }

    void deleteCourse(int courseNum){
        if(Courses.get(
            courseNum).getTotalEnrolled() == 0){
                Courses.get(courseNum)
        } else {
            System.out.println("Course deletion failed – Enrolled student(s) in the class");
        }
    }

    void getInstructor(int TeacherNum){

    }

    void getStudent(int studentID){

    }

    void graduateStudent(int studentID){

    }

    
}
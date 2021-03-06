//Title: Student.java
//Abstract: This program functions like a school record system and will keep track of classes, teachers and students.
//Author: Geoffrey Woods
//3/6/2020

import java.util.HashMap;

public class Student{
    int StudentID;
	String StudentName;
	HashMap<Integer, Double> scoresMap = new HashMap<>();

	public boolean takingCourse(int ID){
		if(scoresMap.containsKey(ID)){
			return true;
		} else{
			System.out.println("Student " + StudentID + " (" + StudentName + ") is not enrolled in " + ID + ".");
			return false;
		}
	}

    public Student(int StudentID, String StudentName){
        this.StudentID = StudentID;
        this.StudentName = StudentName;
    }

	public int getStudentID() {
		return this.StudentID;
	}

	public void setStudentID(int StudentID) {
		this.StudentID = StudentID;
	}

	public String getStudentName() {
		return this.StudentName;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public void addClass(int num){
        scoresMap.put(num, 0.0);
	}
	
	public void addScores(int courseNum, double score){
		scoresMap.replace(courseNum, score);
	}

	public void removeStudent(int ID){
		scoresMap.remove(ID);
	}

	HashMap<Integer,Double> getScoresMap(){
		return scoresMap;
	 }

	@Override
    public String toString(){
		String newString = "";
		double average = 0;
		int size = 0;
        newString += "Student Number: " + StudentID +  "\n" + "Name: " + StudentName + "\nCourses Enrolled: \n";
        for(HashMap.Entry<Integer, Double> course : scoresMap.entrySet()){
			newString += course.getKey() + ": " + course.getValue() + "\n";
			average+=course.getValue();
			size++;
		}
		average = average/size;
		newString += "Course Average: " + average;
            
        return newString;
	}



}
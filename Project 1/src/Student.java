public class Student{
    int StudentID;
    String StudentName;

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



}
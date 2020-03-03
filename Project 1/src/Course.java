public class Course{
    int courseNum;
    String courseTitle;
    int maxStudents;
    String courseLocation;

    public Course(int courseNum, String courseName, int maxStudents, String courseLocation){
        this.courseNum = courseNum;
        this.courseTitle =courseName;
        this.maxStudents = maxStudents;
        this.courseLocation = courseLocation;
    }

	public int getCourseNum() {
		return this.courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseTitle() {
		return this.courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getMaxStudents() {
		return this.maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public String getCourseLocation() {
		return this.courseLocation;
	}

	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}

}
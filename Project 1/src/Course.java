import java.util.HashMap;

public class Course{
    int courseNum;
    String courseTitle;
    int maxStudents;
	String courseLocation;
	int instructorID;

	HashMap<Integer, Double> scoresMap = new HashMap<>();


	public int getInstructorID() {
		return this.instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

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

	public void updateLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}
	
	public void addStudent(int num){
        scoresMap.put(num, 0.0);
	}
	
	public void addScores(int studentNum, double score){
		scoresMap.replace(studentNum, score);
	}

	public void removeStudent(int ID){
		scoresMap.remove(ID);
	}

	public int getTotalEnrolled(){
		return scoresMap.size();
	}

	public double getAverageScores(){
		double total = 0.0;
		for(Double score: scoresMap.values()){
			total+=score;
		}
		if(total != 0){
			total = total/scoresMap.size();
			return total;
		} else{
			return 0;
		}
		
	}

	public boolean courseFull(int num){
		if(getTotalEnrolled() >= getMaxStudents()){
			return true;
		}else{
			return false;
		}
	}
	// public void deleteCourse(int num){
	// 	instructorID = 0;
	// 	scoresMap.clear();
		
	// }

}
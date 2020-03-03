public class Instructor{
    String name;
    int teacherNum;
    String email;
    String teacherPhone;

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

    
}
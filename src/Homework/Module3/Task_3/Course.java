package Homework.Module3.Task_3;
import java.util.Date;
class Course {
    private String name;
    private int hoursDuration;
    private String teacherName;
    private Date startDate;

    public Course(Date startDate, String name){
        this.startDate=startDate;
        this.name=name;
    }
    public Course(int hoursDuration, String name, String teacherName){
        this.hoursDuration=hoursDuration;
        this.name=name;
        this.teacherName=teacherName;
    }

    public Course(){}


    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hoursDuration=" + hoursDuration +
                ", teacherName='" + teacherName + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}

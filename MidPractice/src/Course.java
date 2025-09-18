import java.util.ArrayList;
import java.util.List;

public class Course
{
    private int id;
    private String courseName;
    private List<Student> studentlist;

    public Course(int id, String courseName)
    {
        this.id = id;
        this.courseName = courseName;
        studentlist = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", studentlist=" + studentlist +
                '}';
    }

    public void addStudent(Student student, Course course)
    {
        if(!studentlist.contains(student))
        {
            studentlist.add(student);
        }
        else{
            System.out.println("Student is already enrolled..");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }
}

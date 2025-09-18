import java.util.ArrayList;

public class Teacher extends Person
{
    private int teacherID;
    private String subject;
    ArrayList<Course> taughtCourses;

    public Teacher(Integer id, String name, String address, int teacherID, String subject)
    {
        super(id, name, address);
        this.teacherID = teacherID;
        this.subject = subject;
        taughtCourses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+"Teacher Id : "+ getTeacherID() + "\n"
                +"Subject Name : " + getSubject()+
                "\n";
    }

    //.............................
    public void assignCourse(Course course)
    {
        if(!taughtCourses.contains(course))
        {
            taughtCourses.add(course);
            System.out.println("Teacher : "+getName()+" now Taught the "+course.getCourseName());
        }
        else {
            System.out.println(getName()+" is already taught that course ...");
        }
    }
    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(ArrayList<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
}

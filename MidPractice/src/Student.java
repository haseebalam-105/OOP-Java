import java.util.ArrayList;

public class Student extends Person
{
    private Integer stdID;
    ArrayList<Course> enrolledCourses;

    public Student(Integer id, String name, String address, Integer stdID)
    {
        super(id, name, address);
        setStdID(stdID);
        enrolledCourses = new ArrayList<Course>();
    }

    @Override
    public String toString() {
        return super.toString()
                +"\n"+ "StudentId : " + getStdID()
                +"\n";
    }

    public void enrolledCourse(Course course)
    {
        if(!enrolledCourses.contains(course))
        {
            enrolledCourses.add(course);
            System.out.println("Student : "+getName()+ " enrolled in "+course.getCourseName());

            course.addStudent(this,course);
        }
        else{
            System.out.println("Student is already enrolled..");
        }
    }

    public void unrolledCourse(Course course)
    {
        if(enrolledCourses.contains(course))
        {
            enrolledCourses.remove(course);
            System.out.println("Student Name : " + getName() +" enrolled in "+ course.getCourseName());
        }
        else{
            System.out.println("Course dose not enrolled");
        }
    }

    public Integer getStdID() {
        return stdID;
    }

    public void setStdID(Integer stdID) {
        this.stdID = stdID;
    }
}

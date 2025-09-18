public class Course
{

    private int courseId;
    private String courseTitle;
    private int courseCreditHours;

    public Course(int courseId, String courseTitle, int courseCreditHours)
    {
        setCourseId(courseId);
        setCourseTitle(courseTitle);
        setCourseCreditHours(courseCreditHours);
    }



    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public int getCourseCreditHours()
    {
        return courseCreditHours;
    }

    public void setCourseCreditHours(int courseCreditHours)
    {
        this.courseCreditHours = courseCreditHours;
    }

    public String getCourseTitle()
    {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle)
    {
        this.courseTitle = courseTitle;
    }

    public void displayInfo()
    {
        System.out.println("Course Id : " + courseId);
        System.out.println("Course Title : " + courseTitle);
        System.out.println("Course CreditHours : " + courseCreditHours);
    }

}

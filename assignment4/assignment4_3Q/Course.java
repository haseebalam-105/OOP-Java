public class Course
{
	private int courseCode;
	private String courseTitle;
	
	public Course(int courseCode,String courseTitle)
	{
		setCourseCode(courseCode);
		setCourseTitle(courseTitle);
	}
	
	public void setCourseCode(int courseCode)
	{
		this.courseCode = courseCode;
	}
	public void setCourseTitle(String courseTitle)
	{
		this.courseTitle = courseTitle;
	}

//Getter Methods
	
	public int getCourseCode()
	{
		return courseCode;
	}
	public String getCourseTitle()
	{
		return courseTitle;
	}
}
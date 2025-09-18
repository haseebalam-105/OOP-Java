import java.util.Scanner;

public class CourseResult
{
    private String courseTitle;
    private int[][] marks;

    public CourseResult(String courseTitle, int noOfStudents)
    {
        setCourseTitle(courseTitle);
        marks = new int[noOfStudents][];
    }

    public void setCourseTitle(String courseTitle)
    {
        this.courseTitle = courseTitle;
    }

    public void inputData()
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<marks.length ; i++)
        {
            System.out.print("Enter the number of tests for student "+(i+1)+" :");
            int noOfTests = sc.nextInt();

//For storing the address in the index of marks by making the new object of the number of tests
            marks[i] = new int[noOfTests];

            for(int j=0 ; j< marks[i].length ; j++)
            {
                System.out.print("Enter the marks of "+(j+1)+" test : " );
                int marks1 = sc.nextInt();

                marks[i][j] = marks1;
            }
            System.out.println();
        }
    }

    public void displayData()
    {
        System.out.println("Course Title :" + courseTitle);

        for(int i=0 ; i<marks.length ; i++)
        {
            System.out.print("Marks of Student " + (i+1) + " : ");

            for(int j=0 ; j<marks[i].length ; j++)
            {
                System.out.print(marks[i][j] + "  ");
            }
            System.out.println();
        }
    }


}

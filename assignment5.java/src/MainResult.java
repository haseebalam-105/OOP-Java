import java.util.Scanner;

public class MainResult
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the course title : ");
        String title = sc.nextLine();

        System.out.print("Enter the number of students : ");
        int noOfStudents = sc.nextInt();

        CourseResult result1 = new CourseResult(title,noOfStudents);

        result1.inputData();
        result1.displayData();

    }
}

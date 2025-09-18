import java.util.Scanner;

public class CourseTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students :");
        int num = input.nextInt();

        Course[] courses = new Course[num];

        for(Course course : courses)
        {
            System.out.print("Enter the course Id :");
            int id = input.nextInt();

            input.nextLine();
            System.out.print("Enter the course Title :");
            String title = input.nextLine();

            System.out.print("Enter the course credit hours :");
            int creditHours = input.nextInt();

            course = new Course(id,title,creditHours);
        }

//        for (int i =0 ; i<num ; i++)
//        {
//            System.out.print("Enter the course Id :");
//            int id = input.nextInt();
//
//            input.nextLine();
//            System.out.print("Enter the course Title :");
//            String title = input.nextLine();
//
//            System.out.print("Enter the course credit hours :");
//            int creditHours = input.nextInt();
//
//            courses[i] = new Course(id,title,creditHours);
//        }

        for(Course i : courses)
        {
            i.displayInfo();
        }

    }



}

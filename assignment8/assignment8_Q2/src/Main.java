import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of faculties : ");
        int num = sc.nextInt();

        Faculty[] faculties = new Faculty[num];

        for(int i =0 ; i<faculties.length ; i++)
        {
            System.out.print("Enter the 1 for permanent and 2 for visiting faculty : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.printf("Enter the permanent faculty id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.printf("Enter the name of permanent faculty : ");
                    String name = sc.nextLine();

                    System.out.printf("Enter the basic salary of permanent faculty : ");
                    double salary = sc.nextDouble();

                    faculties[i] = new PermanentFaculty(id,name,salary);
                    break;
                }

                case 2:
                {
                    System.out.printf("Enter the id of visiting faculty : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.printf("Enter the name of visiting faculty : ");
                    String name = sc.nextLine();

                    System.out.printf("Enter the salary per hour of visiting faculty : ");
                    double salrayPerHour = sc.nextDouble();

                    System.out.printf("Enter the hours of visiting faculty : ");
                    double hours = sc.nextDouble();

                    faculties[i] = new VisitingFaculty(id,name,salrayPerHour,hours);
                    break;
                }
                default:
                {
                    System.out.println("You input invalid choice ....Try Again");
                    i--;
                    break;
                }
            }
        }

        for(Faculty faculty : faculties)
        {
            System.out.println(faculty.toString());
        }
        
        for(int i=0 ; i<faculties.length ; i++)
        {
            if(faculties[i] instanceof VisitingFaculty)
            {
                VisitingFaculty visitingFaculty = (VisitingFaculty) faculties[i];
                System.out.println("------------------------------------------");
                System.out.println("Inforamrion of Visiting Faculty after update ...");
                System.out.println(visitingFaculty.toString());
                System.out.printf("Update Salary : %.2f " , (visitingFaculty.calculateSalary() * 0.10) + visitingFaculty.calculateSalary());
            }
        }

    }
}
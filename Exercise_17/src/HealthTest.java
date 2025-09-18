import java.util.Scanner;

public class HealthTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the First name of the patient : ");
        String firstName = sc.nextLine();

        System.out.print("Enter the Last name of the patient : ");
        String lastName = sc.nextLine();

        System.out.print("Enter the Gender of the patient : ");
        String gender = sc.nextLine();

        System.out.print("Enter the height : ");
        double height = sc.nextDouble();

        System.out.print("Enter the weight : ");
        double weight = sc.nextDouble();

        System.out.print("Enter the current year : ");
        int currentYear = sc.nextInt();

        System.out.print("Enter the day of DOB : ");
        int day = sc.nextInt();

        System.out.print("Enter the month of DOB : ");
        int month = sc.nextInt();

        System.out.print("Enter the year of DOB : ");
        int year = sc.nextInt();


//Object for the Date of birth class

        DateOfBirth dob1 = new DateOfBirth(day,month,year);

//Object of the HealthProfile class

        HealthProfile p1 = new HealthProfile(firstName,lastName,gender,height,weight,dob1,currentYear);

        p1.displayInfo();


    }
}
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Information of Student : ");

        System.out.print("Enter name of student : ");
        String name1 = sc.nextLine();

        System.out.print("Enter city of student : ");
        String city1 = sc.nextLine();

        System.out.print("Enter country of student : ");
        String country1 = sc.nextLine();

        System.out.print("Enter program of student : ");
        String program = sc.nextLine();

        System.out.print("Enter year of student : ");
        int year = sc.nextInt();

        System.out.print("Enter Fee of student : ");
        double fee = sc.nextDouble();
        sc.nextLine();

//Information of Staff

        System.out.println("Enter Information of Staff : ");

        System.out.print("Enter name of the staff : ");
        String name2 = sc.nextLine();

        System.out.print("Enter city of Staff : ");
        String city2 = sc.nextLine();

        System.out.print("Enter country of Staff : ");
        String country2 = sc.nextLine();

        System.out.print("Enter Pay of Staff : ");
        double pay = sc.nextDouble();

        Address address1 = new Address(city1 , country1);
        Address address2 = new Address(city2 , country2);

        Student student = new Student (name1 , address1 , program , year , fee );
        student.displayStudent();

        Staff staff = new Staff (name2 , address2 , pay);
        staff.displayStaff();

    }
}
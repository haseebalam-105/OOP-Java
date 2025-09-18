import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);

        ArrayList<Person> arraylists = new ArrayList<>(3);

        System.out.print("Enter number of Persons : ");
        int num = sc.nextInt();

        for(int i = 0 ; i < num ; i++)
        {
            System.out.print("Enter 1 for staff and 2 for student : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter the name of staff :");
                    String name = sc.nextLine();

                    System.out.print("Enter the address of Staff :");
                    String address = sc.nextLine();

                    System.out.print("Enter the University of Staff :");
                    String uni = sc.nextLine();

                    System.out.print("Enter the pay of Staff :");
                    double pay = sc.nextDouble();

                    Person staffs = new Staff(name,address,uni,pay);
                    arraylists.add(staffs);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the name of student :");
                    String name = sc.nextLine();

                    System.out.print("Enter the address of Student :");
                    String address = sc.nextLine();

                    System.out.print("Enter the program : ");
                    String program = sc.nextLine();

                    System.out.print("Enter the year : ");
                    int year = sc.nextInt();

                    System.out.print("Enter the fee : ");
                    double fee = sc.nextDouble();

                    Person students = new Student(name,address,program,year,fee);
                    arraylists.add(students);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice ...");
                    i--;
                }
            }
        }

        for(Person p : arraylists)
        {
            System.out.println(p);
        }


    }
}
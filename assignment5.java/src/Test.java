import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Students : ");
        int m = sc.nextInt();

        System.out.print("Enter the number of addressee you add : ");
        int n = sc.nextInt();

        Address[] address = new Address[n];
        Student[] students = new Student[m];

//For loop for the number of students

        for(int i = 0 ; i<m ;i++)
        {
            System.out.print("Enter the id : ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter the name : ");
            String name = sc.nextLine();

            for(int j = 0 ; j<n ;j++)
            {
                System.out.print("Enter the streetNo : ");
                int streetNo = sc.nextInt();

                sc.nextLine();
                System.out.print("Enter the city : ");
                String city = sc.nextLine();

                System.out.print("Enter the country : ");
                String country = sc.nextLine();

                address[j] = new Address(streetNo,city,country);

            }

            students[i] = new Student(id,name,address);
        }


        for(Student student : students)
        {

            student.displayinfo();
        }
    }
}

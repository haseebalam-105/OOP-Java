import java.util.Scanner;

public class JobApplication
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the age for job : ");
            int age = input.nextInt();

            if(age>25)
            {
                throw new AgeOutOfRangeException();
            }

            System.out.println("Enter your GPa for Job : ");
            double gpa = input.nextDouble();

            if(gpa<2.5)
            {
                throw new LowGpaException();
            }

            System.out.println("Your application is accepted and is under study");
        }catch(AgeOutOfRangeException e)
        {
            System.out.println(e.getMessage());
        }catch(LowGpaException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
                input.close();
        }
    }
}
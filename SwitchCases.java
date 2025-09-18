import java.util.Scanner;
public class SwitchCases{
    public static void main(String[] args){

        String subject;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subject");
        subject =sc.next();

        switch(subject)
        {
            case "Biology":
            {
                System.out.println("You are doing  Fsc pre-medical ");
                break;
            }
            case "Math":
            {
                System.out.println("You are doing the Fsc pre_Engineering");
                break;
            }
            case "Computer":
            {
                System.out.println("You are the ICT student");
                break;
            }
            default:
            {
                System.out.println("Error! Enter the correct subject");
            }
        }


    }

}
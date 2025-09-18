import java.util.Scanner;

class AddTwoNumbers {
    int Sum(int a, int b)
    {
        int add = a + b;
        return add;
    }
}
public class Main
    {
        public static void maiN(String[] args)
        {
            AddTwoNumbers obj1 = new AddTwoNumbers();   // Making the object of the class AddTwoNumbers

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Sum of the two numbers is ");
            int addition = obj1.Sum(a , b);  // Calling  of the method by the usage of object
            System.out.println(addition);
        }

    }

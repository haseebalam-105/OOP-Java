import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int fact;
        System.out.println("Enter the number to which you find the factorial ");
        n = sc.nextInt();

        fact = 1;
        for(int i=1 ; i<=n ; i++)
        {
            fact = fact * i;
            System.out.println("Factorial of the number " + i + " is equal to " + fact);

        }
    }
}

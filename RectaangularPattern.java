import java.util.Scanner;
public class RectaangularPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number of the rows");
        int row = sc.nextInt();
        System.out.println("Enter teh number of the columns");
        int column = sc.nextInt();

        for(int i =1;i<=row;i++)
        {
            for(int j =1;j<=column;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

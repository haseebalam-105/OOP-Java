import java.util.Scanner;
public class NumericPattern
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern of (1 or 2) ");
        int rows = sc.nextInt();

        for(int i=1 ; i<=rows ; i++)
        {
            for(int j=1 ; j<=rows ; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}

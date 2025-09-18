import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows for the triangle ");
        int rows = sc.nextInt();

        //Traversing over the rows
        for(int i=0 ;i<=rows ; i++)
        {
            //print the (rows-i) spaces
            for(int j=1 ; j<=rows-i ; j++)
            {
                System.out.print(" ");
            }
            //print the (2*i-1) stars
            for(int k=1 ; k<=2*i-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

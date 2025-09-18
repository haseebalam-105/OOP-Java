import java.util.Scanner;
public class NumericRectangular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows for the rectangular");
        int rows =sc.nextInt();

        for(int i =1 ; i<=rows ; i++)
        {
            for(int j=i ; j<=rows ; j++)
            {
                System.out.print(j);
            }
            for(int k=1 ; k<=i-1 ; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

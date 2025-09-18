import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] uniqueNumber = new int[4];

        for(int i=0 ; i<uniqueNumber.length ; i++)
        {
            System.out.print("Enter the unique number : ");
            int num = sc.nextInt();

            if(num<10 || num>100)
            {
                System.out.println("Invalid ! ");
                i--;
                continue;
            }
                for(int j =0 ; j<i ; j++)
                {
                    if()
                }
                uniqueNumber[i] = num;
            }
        }
    }
}
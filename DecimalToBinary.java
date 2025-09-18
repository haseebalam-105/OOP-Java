import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be converted from decimal to binary ");
        int num = sc.nextInt();

        int ans = 0;   //binary number
        int power = 1;  //powers of 10

        while(num > 0)
        {
            int parity = num % 2;
            ans += (parity * power);
            power *= 10;
            num /= 2;
        }
        System.out.println(ans);
    }
}

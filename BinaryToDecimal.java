import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number to be converted into the decimal");
        int num=sc.nextInt();

        int ans = 0;
        int power = 1;

        while(num>0){
            int unit_digit = num % 10;
            ans += (unit_digit * power);
            num /= 10;
            power *= 2;
        }
        System.out.println(ans);
    }
}

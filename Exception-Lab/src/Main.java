import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>(3);
        list.add(12.5);
        list.add(13.5);
        list.add(14.5);

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();  // This could throw InputMismatchException if the input is not an integer

            // IndexOutOfBoundsException
            System.out.println("Accessing index 3");
            list.get(3);  // List has only three elements (0, 1, 2),

            // ArithmeticException
            System.out.println("Dividing by zero...");
            double ans = list.get(0) / 0;  // This will throw ArithmeticException

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error!");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch error: " + e.getMessage());
        } finally {
            System.out.println("Exception handling completed.");
        }

        input.close();
    }
}

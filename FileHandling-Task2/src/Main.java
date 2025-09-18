import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "data.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            System.out.println("Enter 10 integers:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                int number = sc.nextInt();
                dos.writeInt(number);
            }
            System.out.println("Data written in file " + fileName);
        } catch (IOException e) {
            System.out.println("Error in writing to file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            System.out.println();
            System.out.println("Reading data from file");
            System.out.println();

            while (dis.available() > 0) {
                int number = dis.readInt();

                if (number < min){
                    min = number;
                }
                if (number > max)
                {
                    max = number;
                }
            }

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

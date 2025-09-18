import java.io.*;
import java.util.Scanner;

public class StudentTest {
    private static final String filepath = "Student.txt";
    private static final String copypath = "CopyFile.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] list = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter details for Student %d : %n", i + 1);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("country: ");
            String country = sc.nextLine();

            Address address = new Address(city,country);

            list[i] = new Student(id,name, gpa,address);
        }

        writeDataonFile(list);

        System.out.println("Student data written in file: " + filepath);
        System.out.println(" ");

        System.out.println("Reading data from file");
        readDataFile(filepath);
        System.out.println(" ");

        System.out.println("Copying data in file");
        copyDataFile(filepath,copypath);
        System.out.println(" ");

        System.out.println("Reading Data from copied file");
        readDataFile(copypath);
        System.out.println(" ");

        sc.close();
    }

    public static void writeDataonFile(Student[] students) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            writer.write("Students Data:\n");
            writer.write(String.format("%-10s %-20s %-20s %-20s %-20s %n", "ID", "Name", "GPA","City","Country"));
            writer.write("=".repeat(70));
            writer.write("\n");

            for (Student student : students) {
                writer.write(student.toFileString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }
    }

    public static void readDataFile(String filepath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                    System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error in data reading : " + e.getMessage());
        }
    }

    public static void copyDataFile(String filepath,String copypath){
        try( BufferedReader reader = new BufferedReader(new FileReader(filepath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(copypath,true))
           )
        {
            int student = 0;
            String line;

            while((line=reader.readLine()) != null ){
                writer.write(line);
                writer.newLine();
                if(!line.startsWith("Student") && !line.startsWith("ID") && line.startsWith("=")){
                    student++;
                }
            }
            System.out.println("Total number of Students : " + student);

        }catch(Exception e){
            System.out.println("Error in copying the file" + e.getMessage());
        }

    }
}



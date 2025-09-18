import java.util.ArrayList;
import java.util.Collections;

public class Student
{
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Ali ");
        students.add("Ahmad ");
        students.add("Umer ");
        students.add("Talha ");

//	Add two more students at the end of students list using students.add()
        students.add("Tooba ");
        students.add("Waleed ");
        System.out.println("After add two more students at the end of list");
        display(students);

//	Print the size of list
        System.out.println("Size of Array : " + students.size());
        System.out.println(" ");
        System.out.println();

//•	Add “Hamza” in the start of students.
        students.add(0 , "Hamza");
        System.out.println("Add “Hamza” in the start of students ");
        display(students);

//•	Add “Rizwan” as second element of list.
        students.add(1 , "Rizwan");
        System.out.println("Add “Rizwan” as second element of list.");
        display(students);

//•	Sort list of students (using Collections.sort())
        Collections.sort(students);
        System.out.println("Sort list of students (using Collections.sort())");
        display(students);

//•	Remove “Tooba” from list
        students.remove("Tooba ");
        System.out.println("Remove “Tooba” from list");
        display(students);

//•	Remove the last element from list.
        students.remove(students.size()-1);
        System.out.println("Remove the last element from list.");
        display(students);

//•	Display the second element from list.
        String name = students.get(1);
        System.out.println();
        System.out.println("Display the second element from list.");
        System.out.println("Second student name : " + name);
        System.out.println();

//•	Update the name of first student. New name should be “Muhammad Waleed”
        students.set(0,"Muhammad Waleed");
        System.out.println("Update the name of first student. New name should be “Muhammad Waleed");
        display(students);

//•	Remove the first name.
        students.remove(0);
        System.out.println("Remove the first name.");
        display(students);

//•	Remove all elements from the list.
        students.clear();
        System.out.println("Remove all elements from the list.");
        display(students);

    }

    public static void display(ArrayList<String> students)
    {
        System.out.println(" ");
        for(String names : students)
        {
            System.out.println(names);
        }
        System.out.println(" ");
    }

}

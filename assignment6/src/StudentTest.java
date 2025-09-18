import java.util.ArrayList;

public class StudentTest
{

    public static void main(String[] args) {

        Students s1 = new Students("Ali" , "SP19-BSE-010");
        Students s2 = new Students("Ahmad" , "SP19-BSE-001");
        Students s3 = new Students("Talha" , "SP19-BSE-002");

        s1.setCGPA(3.9);
        s2.setCGPA(3.7);
        s3.setCGPA(4.0);

// An ArrayList named arraylist and add the above objects to arraylist

        ArrayList<Students> arraylist = new ArrayList<> ();

        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        System.out.println("An ArrayList named arraylist and add the above objects to arraylist");
        display(arraylist);

//	Add another Student object at the start of ArrayList with the following attributes
//	Waleed, SP19-BSE-020

        Students s4 = new Students("Waleed" , "SP19-BSE-020");
        s4.setCGPA(3.2);
        arraylist.add(0 , s4);
        System.out.println("Add another Student object at the start of ArrayList " + ".....Waleed, SP19-BSE-020");
        display(arraylist);


//	Add another Student object at the end of ArrayList with the following attributes
//	Maha, SP19-BSE-002
        Students s5 = new Students("Maha", "SP19-BSE-002");
        s5.setCGPA(3.1);
        arraylist.add(s5);
        System.out.println("Add another Student object at the end of ArrayList " + ".....Maha, SP19-BSE-002");
        display(arraylist);

//	Remove second student from list using index
        arraylist.remove(1);
        System.out.println("Remove second student from list using index");
        display(arraylist);


//	Remove first student from list using object reference
        arraylist.remove(s4);
        System.out.println("Remove first student from list using object reference");
        display(arraylist);

//	Print total number of students
        System.out.println();
        int size = arraylist.size();
        System.out.println("Total number of Students in list : " + size);
        System.out.println();


//	Replace the student at index 0 with new student
        Students s6 = new Students("Haseeb" , "SP24-BCS-142");
        s6.setCGPA(3.6);
        arraylist.set(0 , s6);
        System.out.println("Replace the student at index 0 with new student");
        display(arraylist);

//	Now display information of first student in list
        System.out.println("Now display information of first student in list");
        System.out.print(arraylist.get(0).getName());
        System.out.print("    " + arraylist.get(0).getId());
        System.out.print("         CGPA : " + arraylist.get(0).getCGPA());
        System.out.println();

    }

    public static void display(ArrayList<Students> arraylist)
    {
        for(Students array : arraylist)
        {
            System.out.print(array.getName());
            System.out.print("    " + array.getId());
            System.out.print("         CGPA : " + array.getCGPA());
            System.out.println();
        }

        System.out.println();
    }
}

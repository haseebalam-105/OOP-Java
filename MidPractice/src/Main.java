public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome.......");

        Course c1 = new Course(1,"OOP");
        Course c2 = new Course(2,"PF");

        Student std1 = new Student(1,"ALI","Lahore",1001);
        Student std2 = new Student(2,"Hassan","Karachi",1002);
        Student std3 = new Student(3,"ALllI","Lahore",1003);

        Teacher teacher1 = new Teacher(1,"Zaheer","Lahore",2001,"OOP");
        Teacher teacher2 = new Teacher(2,"hassan","Lahore",2002,"PF");

        std1.enrolledCourse(c1);
        std2.enrolledCourse(c2);
        std3.enrolledCourse(c2);

        System.out.println("See the information of the students ...");

        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());


        std2.unrolledCourse(c2);

        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());


        teacher1.assignCourse(c1);
        teacher1.assignCourse(c2);
        teacher2.assignCourse(c1);
        teacher2.assignCourse(c2);

        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(teacher1.toString());

        System.out.println("Reapert course for treacher");
        teacher2.assignCourse(c1);

        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());

    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> int1 = new ArrayList<>();
        int1.add(11);
        int1.add(12);
        int1.add(13);
        ArrayDispaly array1 = new ArrayDispaly(int1);
        array1.display();


        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Haseeb");
        str1.add("Hassan");
        str1.add("Raza");
        ArrayDispaly array2 = new ArrayDispaly(str1);
        array2.display();




    }
}
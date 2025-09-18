import java.util.ArrayList;
import java.util.List;

public class Borrrower
{
    private String name;
    ArrayList<LibraryItem> list = new ArrayList<>();


    public void borrowedItem(LibraryItem i)
    {
        list.add(i);
        i.isAvailable();
    }
}

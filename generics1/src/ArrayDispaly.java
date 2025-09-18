import java.util.List;

public class ArrayDispaly <T>
{
    List<T> list;

    public ArrayDispaly(List<T> list){
        this.list = list;
    }

    public void display()
    {
        for(T t : list){
            System.out.println(t);
        }
    }

}

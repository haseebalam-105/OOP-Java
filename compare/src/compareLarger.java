public class compareLarger<T> implements Comparable<T>
{

    public <T> void compare(T num1,T num2){
        num1.compare(num2);

    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}

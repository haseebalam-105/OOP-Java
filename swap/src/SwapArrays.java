public class SwapArrays<T> {
    private T swap;
    private T num1;
    private T num2;

    public void swapp(T num1,T num2)
    {
        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("Numbers after swaping : " + num1 + " and " + num2);
    }
}

public interface Borrowable
{
    void checkOut();
    boolean isAvailable();
    int returnItem();

}

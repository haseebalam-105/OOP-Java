public class Book extends LibraryItem{

    public Book(String title, String author, int publicationYear)
    {
        super(title, author, publicationYear);
    }

    @Override
    public void checkOut()
    {
        System.out.println("Book is checked Out..");
    }
    @Override
    public int returnItem()
    {
        return 1;
    }
    @Override
    public boolean isAvailable()
    {
        return true;
    }
}

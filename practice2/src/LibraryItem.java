public class LibraryItem implements Borrowable
{
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

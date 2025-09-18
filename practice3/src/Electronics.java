public class Electronics extends Product
{
    public Electronics(String name, String productId, double price, int stock)
    {
        super(name, productId, price, stock);
    }

    @Override
    public void addToCart() {

    }

    @Override
    public void purchase() {
        if(stock>0)
        {
            System.out.println("You Purchased : " + getName() +" Of price : " + getPrice());
            setStock(stock-1);
        }
        else {
            System.out.println("Not in stock ");
        }
    }

    @Override
    public void returnItem() {

    }
}

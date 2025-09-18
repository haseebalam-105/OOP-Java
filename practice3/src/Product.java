public abstract class Product implements Purchaseable
{
    protected String name;
    protected String productId;
    protected double price;
    protected int stock;

    public Product(String name, String productId, double price, int stock) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void purchase();
    public abstract  void returnItem();
}

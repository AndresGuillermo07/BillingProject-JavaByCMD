package co.com.aap.sells.Classes;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int productsCounter ;

    private Product() {
        this.idProduct = ++Product.productsCounter;
    }
    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdProduct(int idProduct) {
        return idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

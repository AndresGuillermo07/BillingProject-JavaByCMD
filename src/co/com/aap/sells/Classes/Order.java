package co.com.aap.sells.Classes;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Order {
    private final int idOrder;
    private Product products[];
    private static int ordersCounter;
    private int productsCounter;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = ++Order.ordersCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if(this.productsCounter < Order.MAX_PRODUCTS){
            this.products[this.productsCounter++] = product;
        }else
            System.out.println("The limit of allowed products has been exceeded " + Order.MAX_PRODUCTS);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i <this.productsCounter ; i++) {
           totalPrice += this.products[i].getPrice();

        }
        return totalPrice;
    }

    public void showOrder(){

        // DECIMAL FORMAT
        DecimalFormat df = new DecimalFormat("0.00");


        if (this.products.length != 0) {
            System.out.println();
            System.out.println("---------------------------------------");


            System.out.println("Id Sell Order:" + this.idOrder);
            System.out.println("Products:");
            for (int i = 0; i < this.productsCounter; i++) {
                System.out.println(i+1 + ". " + this.products[i].getName() + " --> " + products[i].getPrice());
            }
            System.out.println("Total price: $" + df.format(this.getTotalPrice()));

        }else
            System.out.println("No products available");

    }


}

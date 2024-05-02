package co.com.aap.sells.Main;

import co.com.aap.sells.Classes.Order;
import co.com.aap.sells.Classes.Product;

public class Sells {
    public static void main(String[] args) {

        //PRODUCTS

        Product Product1 = new Product("Product1",15.74);
        Product Product2 = new Product("Product2",20.92);
        Product Product3 = new Product("Product3",30.59);
        Product Product4 = new Product("Product4",40.83);
        Product Product5 = new Product("Product5",50.99);
        Product Product6 = new Product("Product6",60.12);

        //ORDERS
        Order Order1 = new Order();
        Order1.addProduct(Product1);
        Order1.addProduct(Product2);
        Order1.showOrder();

        Order Order2 = new Order();
        Order2.addProduct(Product1);
        Order2.addProduct(Product2);
        Order2.addProduct(Product3);
        Order2.addProduct(Product4);
        Order2.addProduct(Product5);
        Order2.addProduct(Product6);
        Order2.showOrder();
    }
}

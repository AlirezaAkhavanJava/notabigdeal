package simp.SerializationPractice;

import java.io.Serializable;

public class Product implements Serializable {
    String productName;
    transient float price;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

}

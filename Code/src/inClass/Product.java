package inClass;

import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0;  // number of Products for sale

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public Product() {
        this("", "", 0.0);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getFormattedPrice(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString(){
        return "Code:        " + code + "\n" +
                "Description: " + description + "\n" +
                "Price:       " + this.getFormattedPrice()
                + "\n";
    }
    public static int getCount(){
        return count;
    }
}

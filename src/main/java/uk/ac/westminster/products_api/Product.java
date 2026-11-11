package uk.ac.westminster.products_api;
// Tutorial 2 - Activity 1, Step 8
// Product class stores a product's ID, name and price.
// The constructor gives these values to a new Product object.
public class Product {
    public Long id;
    public String name;
    public double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}


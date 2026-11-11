package uk.ac.westminster.products_api;
// Tutorial 2 - Activity 1, Step 8
// Product class stores a product's ID, name and price.
// The constructor gives these values to a new Product object.
public class Product {
    // T2, Activity 2, Step 15 - Prediction:
// Activity 2: Private fields hide the data.
// Without getters, Swagger shows empty (empty JSON){}.
// With getters, Swagger shows the product details again.
// Status 200 means the request worked.
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
//Activity 4 — Draw the Product UML Class Diagram
//---------------------------------------------------------
//Product                                                 -
//---------------------------------------------------------
//- id : Long                                             -
//- name : String                                         -
//- price : double                                        -
//---------------------------------------------------------
//+ Product()                                             -
//+ Product(id : Long, name : String, price : double)     -
//+ getId() : Long                                        -
//+ getName() : String                                    -
//+ getPrice() : double                                   -
//---------------------------------------------------------
package uk.ac.westminster.products_api;

public class Address {

    // Private fields store the address details
    private String street;
    private String city;
    private String postcode;

    // Empty constructor: creates an Address without details
    public Address() {
    }

    // Full constructor: gives the Address its details
    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    // Getters allow other code to read the private fields
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }
}



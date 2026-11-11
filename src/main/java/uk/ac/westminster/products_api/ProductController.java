package uk.ac.westminster.products_api;

import org. springframework.web.bind.annotation.GetMapping;
import org. springframework. web. bind. annotation. PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Tells Spring this class handles API requests

@RequestMapping("/products") // Main URL for products

public class ProductController { // Class that handles product requests

    @GetMapping("/{id}") // Handles GET /products/1 to retrieve a product

    public Product getById(@PathVariable Long id) {
        // Reads the ID from the URL and returns a Product

        return new Product(id, "Laptop", 999.99);
        // Creates a Laptop with this ID and price, then sends it back
    }
}

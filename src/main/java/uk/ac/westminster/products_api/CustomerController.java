package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Customers")

public class CustomerController {

        @GetMapping("/{id}")
        public Customer getById(@PathVariable Long id) {

            Address homeAddress = new Address("Oxford Street", "London", "W1");
            return new Customer(id, "Ada", "ada@example.com", homeAddress);
        }


}

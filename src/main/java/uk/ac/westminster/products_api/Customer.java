package uk.ac.westminster.products_api;

public class Customer {


        // Customer details
        private Long id;
        private String name;
        private String email;
        private Address address; // A Customer has an Address

        // Empty constructor
        public Customer() {
        }

        // Full constructor
        public Customer(Long id, String name, String email, Address address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
        }

        // Getters
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public Address getAddress() {
            return address;
        }

}


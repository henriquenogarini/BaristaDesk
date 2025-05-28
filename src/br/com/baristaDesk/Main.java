package br.com.baristaDesk;

import br.com.baristaDesk.model.Product;

public class Main {
    public static void main(String[] args) {
        // Create a new product
        Product product1 = new Product("Espresso", "Strong and bold coffee", "Beverages", 2.50, 100, "CAF001");

        // Display product details
        System.out.println("Product 1: " + product1);

    }
}

package br.com.baristaDesk;

import br.com.baristaDesk.model.Product;
import br.com.baristaDesk.repository.ItemRepository;

public class Main {
    public static void main(String[] args) {
        ItemRepository itemRepository = new ItemRepository();

        Product p1 = new Product("Espresso", "Strong coffee", "Coffee", 5.0, 20, "P001");
        Product p2 = new Product("Latte", "Coffee with milk", "Coffee", 6.5, 15, "P002");
        Product p3 = new Product("Croissant", "Buttery pastry", "Food", 4.0, 10, "P003");

        itemRepository.addItem(p1);
        itemRepository.addItem(p2);
        itemRepository.addItem(p3);

        System.out.println("All items in the repository: \n");
        itemRepository.getAllItems().forEach(System.out::println);

        System.out.println("\n Removing item with ID 'P002'");
        itemRepository.removeItemById("P002");

        System.out.println("\n📦 Items in repository after remove:");
        itemRepository.getAllItems().forEach(System.out::println);
    }
}

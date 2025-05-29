package br.com.baristaDesk.repository;

import br.com.baristaDesk.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    private List<Item> itemList;

    public ItemRepository() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public List<Item> getAllItems() {
        return new ArrayList<>(itemList);
    }

    public boolean removeItemById(String id) {
        return itemList.removeIf(item -> {
            if (item instanceof br.com.baristaDesk.model.Product product) {
                return product.getProductId().equals(id);
            }
            return false;
        });
    }
}
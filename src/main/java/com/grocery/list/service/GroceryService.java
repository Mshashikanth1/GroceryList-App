package com.grocery.list.service;

import com.grocery.list.model.GroceryItem;
import com.grocery.list.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService {
    private final ItemRepository groceryItemRepo;

    public GroceryService(ItemRepository groceryItemRepo) {
        this.groceryItemRepo = groceryItemRepo;
    }

    public String createMustNeedGroceryItems() {
        groceryItemRepo.save(new GroceryItem( "Whole Wheat Biscuit", 5, "snacks"));
        groceryItemRepo.save(new GroceryItem( "XYZ Kodo Millet healthy", 2, "millets"));
        groceryItemRepo.save(new GroceryItem( "Dried Whole Red Chilli", 2, "spices"));
        groceryItemRepo.save(new GroceryItem( "Healthy Pearl Millet", 1, "millets"));
        groceryItemRepo.save(new GroceryItem( "Bonny Cheese Crackers Plain", 6, "snacks"));
        return "Data creation complete...";
    }

    public List<GroceryItem> showAllGroceryItems() {
        return groceryItemRepo.findAll();
    }

    public String deleteAllGroceryItems() {
        try {
            groceryItemRepo.deleteAll(); groceryItemRepo.deleteById(id);
        }catch (Exception ex){return ex.getMessage();}
        return "Data cleared ...";
    }

    public String deleteAllGroceryItemsById(String id) {
        try {
             groceryItemRepo.deleteById(id);
        }catch (Exception ex){return ex.getMessage();}
        return "Data with id {} ...".concat(id);

    }
}

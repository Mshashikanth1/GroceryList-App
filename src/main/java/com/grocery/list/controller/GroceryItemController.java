package com.grocery.list.controller;

import com.grocery.list.dto.GroceryItemDto;
import com.grocery.list.model.GroceryItem;
import com.grocery.list.repository.ItemRepository;
import com.grocery.list.service.GroceryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/grocery")
public class GroceryItemController {
    private final GroceryService groceryService;

    public GroceryItemController( GroceryService groceryService) {
        this.groceryService = groceryService;
    }

    @PostMapping
    String createMustNeedGroceryItems() {
        return groceryService.createMustNeedGroceryItems();
    }

    @GetMapping
    public List<GroceryItem> showAllGroceryItems(){
        return groceryService.showAllGroceryItems();

    }

    @DeleteMapping()
    public String  deleteAllGroceryItems(){
        return groceryService.deleteAllGroceryItems();
    }

    @DeleteMapping()
    public String  deleteAllGroceryItemsById(@RequestParam String id){
        return groceryService.deleteAllGroceryItemsById(id);
    }

}

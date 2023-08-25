package com.grocery.list.repository;

import com.grocery.list.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ItemRepository extends MongoRepository<GroceryItem,String>{
    @Query("{name: '?0'}")
    GroceryItem findGroceryItemByName(String name);
    @Query(value="{category: '?0'}",fields = "{'name': 1,'category': 1}")
    GroceryItem findAllByCategory(String category);

}

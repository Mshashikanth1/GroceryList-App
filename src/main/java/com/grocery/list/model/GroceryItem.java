package com.grocery.list.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Document("grocery_item")
public class GroceryItem {

    @Id @Generated({})
    private String id;

    public String getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    private double quantity;
    private String category;

    public GroceryItem(String name,double quantity,String category){
        super();
        this.name=name;
        this.quantity=quantity;
        this.category=category;
    }
}

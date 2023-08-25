package com.grocery.list.dto;

public class GroceryItemDto {


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

    public GroceryItemDto(String name, double quantity, String category) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}
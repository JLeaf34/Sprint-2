package com.example.sprint1.Entities;

public class Product {

    private int image;
    private String name;
    private String description;
    private int price;

    /*
    public Product(byte[] image, String name, String description, int price) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
    }

     */

    /*
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

     */

    public Product(int image, String name, String description, int price) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

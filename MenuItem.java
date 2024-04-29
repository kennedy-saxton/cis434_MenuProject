/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menusystem;

/**
 *
 * @author erichernandez
 */
public class MenuItem {
    private final int id;
    private String name;
    private String description;
    private double price;
    private int categoryId; // Assuming each item belongs to one category

    public MenuItem(int id, String name, String description, double price, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

    // Getters and setters for name, description, price, categoryId
    // No setter for id because it's final

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
}

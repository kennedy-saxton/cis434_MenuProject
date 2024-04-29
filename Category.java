/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menusystem;

/**
 *
 * @author erichernandez
 */
import java.util.ArrayList;
import java.util.List;

public class Category {
    private final int id;
    private String name;
    private List<MenuItem> menuItems;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    // Getters and setters for name and menuItems
    // No setter for id because it's final

    // ... other getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}


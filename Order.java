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

public class Order {
    private final int id;
    private List<MenuItem> itemsOrdered;
    private double totalPrice;

    public Order(int id) {
        this.id = id;
        this.itemsOrdered = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(MenuItem item) {
        itemsOrdered.add(item);
        totalPrice += item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // ... other necessary methods

    public int getId() {
        return id;
    }

    public List<MenuItem> getItemsOrdered() {
        return itemsOrdered;
    }
}


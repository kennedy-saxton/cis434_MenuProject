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

public class MenuService {
    private static final String MENU_FILE = "menu.data";
    private static final String ORDER_FILE = "order.data";
    
    // Menu Operations
    public List<MenuItem> getMenuItems() {
        return FileHandler.readFromFile(MENU_FILE);
    }

    public void addMenuItem(MenuItem item) {
        List<MenuItem> menuItems = getMenuItems();
        menuItems.add(item);
        FileHandler.writeToFile(menuItems, MENU_FILE);
    }

    // Order Operations
    public List<Order> getOrders() {
        return FileHandler.readFromFile(ORDER_FILE);
    }

    public void addOrder(Order order) {
        List<Order> orders = getOrders();
        orders.add(order);
        FileHandler.writeToFile(orders, ORDER_FILE);
    }

    // Further methods can be added for updating and deleting menu items and orders
}


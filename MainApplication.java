/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menusystem;
import java.util.List;
/**
 *
 * @author erichernandez
 */
public class MainApplication {

    public static void main(String[] args) {
        MenuService menuService = new MenuService();

        // Add menu items
        MenuItem coffee = new MenuItem(1, "Coffee", "Freshly brewed coffee", 1.99, 1);
        menuService.addMenuItem(coffee);

        // Create an order and add it
        Order order = new Order(1);
        order.addItem(coffee);
        menuService.addOrder(order);

        // Retrieve and display menu items
        List<MenuItem> menuItems = menuService.getMenuItems();
        System.out.println("Menu Items:");
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        // Retrieve and display orders
        List<Order> orders = menuService.getOrders();
        System.out.println("\nOrders:");
        for (Order ord : orders) {
            System.out.println("Order ID: " + ord.getId() + ", Total Price: $" + ord.getTotalPrice());
        }
    }
}

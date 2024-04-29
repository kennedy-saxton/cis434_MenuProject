/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menusystem;

/**
 *
 * @author erichernandez
 */
import java.util.ArrayList;
import java.util.List;

public class MenuSystem {
    private List<Category> categories;
    private List<Order> orders;

    public MenuSystem() {
        categories = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    // ... other methods to interact with the system

    public static void main(String[] args) {
        // Initialize the menu system, categories, and items
        MenuSystem system = new MenuSystem();
        
        Category Entre = new Category(1, "Entre");
        //Category desserts = new Category(2, "Desserts");
        
        system.addCategory(Entre);
        //system.addCategory(desserts);
        
        MenuItem Csand = new MenuItem(1, "Chicken Sandwhich", "Fresh chicken", 3.75, Entre.getId());
        MenuItem Cobb = new MenuItem(2, "Cobb Salad", "Fresh chicken", 7.99, Entre.getId());
        MenuItem Shaw = new MenuItem(3, "Chicken Sharwarma", "Fresh chicken", 10.99, Entre.getId());
        MenuItem Nugs = new MenuItem(4, "nuggets of chicken", "Fresh chicken", 7.99, Entre.getId());
        MenuItem Biscuit = new MenuItem(5, "Biscuit", "Fresh chicken", 7.99, Entre.getId());
        MenuItem Taco = new MenuItem(6, "Tacos De Birria", "Fresh chicken", 7.99, Entre.getId());
        MenuItem Pap = new MenuItem(7, "chicken paprikash", "Fresh chicken", 9.99, Entre.getId());
        MenuItem Pho = new MenuItem(8, "Pho", "Fresh chicken", 19.99, Entre.getId());
        MenuItem Couscous = new MenuItem(9, "Conscous", "Fresh chicken", 24.99, Entre.getId());
        MenuItem Fsalad = new MenuItem(10, "Faattoush Salad", "Fresh chicken", 9.99, Entre.getId());
    
        Entre.addMenuItem(Csand);
        Entre.addMenuItem(Cobb);
        Entre.addMenuItem(Shaw);
        Entre.addMenuItem(Nugs);
        Entre.addMenuItem(Biscuit);
        Entre.addMenuItem(Taco);
        Entre.addMenuItem(Pap);
        Entre.addMenuItem(Pho);
        Entre.addMenuItem(Couscous);
        Entre.addMenuItem(Fsalad);

        /*Create an order and add items
        Order order = new Order(1);
        order.addItem(coffee); 

        system.createOrder(order);
            
        // For demonstration, print the total price of the order
        System.out.println("Total order price: " + order.getTotalPrice());
        */
    }
}


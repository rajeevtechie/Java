import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

interface Taxable {
    double calculateTax();
}

abstract class Item implements Taxable {
    String itemID;
    String name;
    double basePrice;

    Item(String itemID, String name, double basePrice) {
        this.itemID = itemID;
        this.name = name;
        this.basePrice = basePrice;
    }

    abstract void display();

    double getTotalPrice() {
        return basePrice + calculateTax();
    }
}

class PerishableItem extends Item {
    String expiryDate;

    PerishableItem(String itemID, String name, double basePrice, String expiryDate) {
        super(itemID, name, basePrice);
        this.expiryDate = expiryDate;
    }

    public double calculateTax() {
        return basePrice * 0.05;
    }

    void display() {
        System.out.println("Perishable | ID: " + itemID +
                " | Name: " + name +
                " | Price: $" + basePrice +
                " | Expiry: " + expiryDate);
    }
}

class ElectronicItem extends Item {
    String warrantyPeriod;

    ElectronicItem(String itemID, String name, double basePrice, String warrantyPeriod) {
        super(itemID, name, basePrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public double calculateTax() {
        return basePrice * 0.15;
    }

    void display() {
        System.out.println("Electronic | ID: " + itemID +
                " | Name: " + name +
                " | Price: $" + basePrice +
                " | Warranty: " + warrantyPeriod);
    }
}


public class SmartWarehouse {

    static HashMap<String, Item> inventory = new HashMap<>();

    static void searchItem(String id) {
        if (inventory.containsKey(id)) {
            System.out.println("Item Found:");
            inventory.get(id).display();
        } else {
            System.out.println("Item with ID " + id + " not found.");
        }
    }

    static void displayAll() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Item i : inventory.values()) {
            i.display();
        }
    }

    // ---------- TOTAL VALUE ----------
    static void totalValue() {
        double total = 0;
        for (Item i : inventory.values()) {
            total += i.getTotalPrice();
        }
        System.out.println("Total Inventory Value (Incl. Tax): $" +
                String.format("%.2f", total));
    }

    // ---------- SORT BY PRICE ----------
    static void sortByPrice() {
        ArrayList<Item> list = new ArrayList<>(inventory.values());
        list.sort(Comparator.comparingDouble(i -> i.basePrice));

        System.out.println("Items sorted by price:");
        for (Item i : list) {
            i.display();
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== LogistiTech Smart Warehouse =====");
            System.out.println("1. Add Perishable Item");
            System.out.println("2. Add Electronic Item");
            System.out.println("3. Display All Items");
            System.out.println("4. Search Item by ID");
            System.out.println("5. Total Inventory Value");
            System.out.println("6. Sort Items by Price");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID Name Price ExpiryDate: ");
                    String id1 = sc.next();
                    String name1 = sc.next();
                    double price1 = sc.nextDouble();
                    String exp = sc.next();
                    inventory.put(id1, new PerishableItem(id1, name1, price1, exp));
                    break;

                case 2:
                    System.out.print("Enter ID Name Price Warranty: ");
                    String id2 = sc.next();
                    String name2 = sc.next();
                    double price2 = sc.nextDouble();
                    String war = sc.next();
                    inventory.put(id2, new ElectronicItem(id2, name2, price2, war));
                    break;

                case 3:
                    displayAll();
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    String search = sc.next();
                    searchItem(search);
                    break;

                case 5:
                    totalValue();
                    break;

                case 6:
                    sortByPrice();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
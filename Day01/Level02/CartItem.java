class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize CartItem details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for the attributes
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display CartItem details
    public void displayItemDetails() {
        System.out.println(itemName + " - Price: $" + price + " Quantity: " + quantity + " Total: $" + getTotalCost());
    }
}

// ShoppingCart class to handle cart operations
class ShoppingCart {
    private CartItem[] cartItems;
    private int itemCount;

    // Constructor to initialize the cart with a fixed size array
    public ShoppingCart(int capacity) {
        cartItems = new CartItem[capacity];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equals(itemName)) {
                // Shift remaining items to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null;  // Set the last element to null
                itemCount--;
                itemFound = true;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!itemFound) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("\nItems in the Cart:");
        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displayItemDetails();
            totalCost += cartItems[i].getTotalCost();
        }
        System.out.println("\nTotal Cost: $" + totalCost);
    }
}

// Main class to simulate shopping cart operations
public class ShoppingCartSimulator {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5); // Cart with capacity of 5 items

        // Adding items to the cart
        cart.addItem("Laptop", 800.00, 1);
        cart.addItem("Phone", 500.00, 2);
        cart.addItem("Headphones", 100.00, 1);

        // Displaying total cost
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Phone");

        // Displaying total cost after removal
        cart.displayTotalCost();
    }
}

public class Product {
    // Instance variables
    private final int productID; // Final variable for unique product ID
    private String productName;
    private double price;
    private int quantity;

    // Static variables (shared among all products)
    public static int totalProducts = 0;
    public static double discount = 0.0;

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity) {
        this.productID = ++totalProducts; // Unique ID assigned based on total products
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    // Static method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Main method
    public static void main(String[] args) {
        // Update the discount for all products
        Product.updateDiscount(15.0);

        // Creating product objects
        Product product1 = new Product("Laptop", 999.99, 5);
        Product product2 = new Product("Smartphone", 699.99, 10);
        Product product3 = new Product("Headphones", 199.99, 20);

        // Validate using instanceof before displaying details
        if (product1 instanceof Product) {
            System.out.println("Product 1 Details:");
            product1.displayProductDetails();
        }

        if (product2 instanceof Product) {
            System.out.println("\nProduct 2 Details:");
            product2.displayProductDetails();
        }

        if (product3 instanceof Product) {
            System.out.println("\nProduct 3 Details:");
            product3.displayProductDetails();
        }

        // Display the total number of products created
        System.out.println();
        Product.displayTotalProducts();
    }
}

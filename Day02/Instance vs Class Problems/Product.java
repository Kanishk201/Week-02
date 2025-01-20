public class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all products)
    public static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Headphones", 199.99);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        // Display the total number of products created
        System.out.println();
        Product.displayTotalProducts();
    }
}

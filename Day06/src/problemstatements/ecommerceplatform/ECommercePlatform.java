package problemstatements.ecommerceplatform;

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        Product[] products = new Product[] {
                new Electronics("E001", "Laptop", 60000),
                new Clothing("C001", "Jacket", 2000),
                new Groceries("G001", "Rice", 500)
        };

        // Calculate and print final prices
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("-----------------------");
        }
    }
}

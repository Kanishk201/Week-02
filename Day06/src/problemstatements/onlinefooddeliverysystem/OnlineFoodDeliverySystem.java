package problemstatements.onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create instances of food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Apply discounts
        ((Discountable) vegItem).applyDiscount(10); // 10% discount on veg item
        ((Discountable) nonVegItem).applyDiscount(5); // 5% discount on non-veg item

        // Display item details and total prices
        System.out.println(vegItem.getItemDetails());
        System.out.println(((Discountable) vegItem).getDiscountDetails());
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());

        System.out.println(nonVegItem.getItemDetails());
        System.out.println(((Discountable) nonVegItem).getDiscountDetails());
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());

        // Process order
        processOrder(vegItem);
        processOrder(nonVegItem);
    }

    // Polymorphic method to process orders
    public static void processOrder(FoodItem foodItem) {
        System.out.println("Processing order for: " + foodItem.getItemName());
        System.out.println("Total to pay: " + foodItem.calculateTotalPrice());
    }
}


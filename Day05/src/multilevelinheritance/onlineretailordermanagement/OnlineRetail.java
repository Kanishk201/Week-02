package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetail {
    public static void main(String[] args) {
        // Create objects for each level
        Order order = new Order("O001", "2025-01-20");
        ShippedOrder shippedOrder = new ShippedOrder("O002", "2025-01-18", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O003", "2025-01-15", "TRK789012", "2025-01-22");

        // Display details for each order
        System.out.println("Base Order Details:");
        order.displayOrderDetails();
        System.out.println("\nShipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("\nDelivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}

package multilevelinheritance.onlineretailordermanagement;

class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call superclass constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number " + trackingNumber;
    }

    // Overriding displayOrderDetails to include tracking info
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
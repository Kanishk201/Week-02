package multilevelinheritance.onlineretailordermanagement;

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    // Overriding displayOrderDetails to include delivery info
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

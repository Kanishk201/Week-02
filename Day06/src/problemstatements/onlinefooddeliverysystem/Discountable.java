package problemstatements.onlinefooddeliverysystem;

// Interface for discountable items
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}
package problemstatements.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + (additionalCharge * getQuantity());
        return basePrice - (basePrice * (discount / 100));
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }
}


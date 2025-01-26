package problemstatements.ecommerceplatform;

class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05; // 5%

    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}


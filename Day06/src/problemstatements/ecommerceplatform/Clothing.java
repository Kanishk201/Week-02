package problemstatements.ecommerceplatform;

class Clothing extends Product implements Taxable {
    private static final double DISCOUNT_RATE = 0.15; // 15%
    private static final double TAX_RATE = 0.05; // 5%

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax rate for Clothing: 5%";
    }
}

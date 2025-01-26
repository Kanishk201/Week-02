package problemstatements.ecommerceplatform;

class Electronics extends Product implements Taxable {
    private static final double DISCOUNT_RATE = 0.10; // 10%
    private static final double TAX_RATE = 0.18; // 18%

    public Electronics(String productId, String name, double price) {
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
        return "Tax rate for Electronics: 18%";
    }
}

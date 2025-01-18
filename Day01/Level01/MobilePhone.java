public class MobilePhone{
   // Attributes
   String brand;
   String model;
   double price;
   
   // Constructor
   public MobilePhone(String brand, String model, double price){
      this.brand=brand;
	  this.model=model;
	  this.price=price;
   }
   
   // Method to display phone details
   public void displayDetails() {
      System.out.println("Mobile Phone Details:");
      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: $" + price);
   }
   
   // Main method
   public static void main(String[] args){
   MobilePhone phone = new MobilePhone("Samsung", "Galaxy S22", 799.99);
   
   // Display details of mobile phone
   phone.displayDetails();
   }
}
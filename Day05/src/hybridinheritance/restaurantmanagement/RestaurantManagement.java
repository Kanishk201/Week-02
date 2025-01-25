package hybridinheritance.restaurantmanagement;

public class RestaurantManagement {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emily", 202);

        // Display information and perform duties
        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}

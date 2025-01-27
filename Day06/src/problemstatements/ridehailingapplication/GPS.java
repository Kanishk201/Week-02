package problemstatements.ridehailingapplication;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

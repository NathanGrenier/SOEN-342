public class Package {
    TrackingType id;
    Location origin;
    Location destination;
    Location currentLocation;
    Map<Location, Boolean> locationHistory;

    // Constructor
    public Package(id: TrackingType, origin: Location, destination: Location) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.currentLocation = origin;
        this.locationHistory = new HashMap<Location, boolean>();
        createLocations(this.source, this.destination);
    }

    private void createLocations(Location source, Location destination) {

    }
}
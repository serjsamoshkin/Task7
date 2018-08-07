package sub09.model;

public class Subscriber {
    private Location location;
    private String address;

    public Subscriber(Location location, String address) {
        this.location = location;
        this.address = address;
    }

    public  void receive(Magazine magazine){
        System.out.println(String.format("По адресу %s получен журнал %s", address, magazine));
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public enum Location{
        VILLAGE,
        TOWN,
        ;

    }

}

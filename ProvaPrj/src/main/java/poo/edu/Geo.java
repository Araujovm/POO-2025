package poo.edu;

public class Geo {
    private double latitude;
    private double longitude;
    public Geo(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String toString(){
        return "latitude: "+this.latitude+" Longitude: "+this.longitude;
    }
}

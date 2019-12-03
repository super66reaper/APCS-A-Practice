import java.util.*;

public class Location {

    private double lat = 0;
    private double longi = 0;
    private String name = "";

    public Location(double lat, double longi, String name) {
        this.lat = lat;
        this.longi = longi;
        this.name = name;
    }

    public void SetLat(double lat) {
        this.lat = lat;
    }
    public void SetLong(double longi) {
        this.longi = longi;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public double GetLat() {
        return lat;
    }
    public double GetLong() {
        return longi;
    }
    public String GetName() {
        return name;
    }

    public double FindDistance(Location otherLocation) {
        double lat2 = otherLocation.GetLat();
        double long2 = otherLocation.GetLong();
        String name2 = otherLocation.GetName();
        final double r = 6371;
        double a = (Math.sin((Math.abs(lat - lat2)) / 2) * 
                    Math.sin((Math.abs(lat - lat2)) / 2)) + 
                    (Math.cos(lat) * Math.cos(lat2)) *
                    (Math.sin((Math.abs(longi - long2)) / 2) *
                    Math.sin((Math.abs(longi - long2)) / 2));

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double d = r * c;

        return d;
    }
}
import java.util.*;

public class WeatherInfo {

    public Location location;
    double temp = 0;

    public WeatherInfo(Location location, Double temp) {
        this.location = location;
        this.temp = temp;
    }

    public String GetName() {
        return location.GetName();
    }
    public double GetLong() {
        return location.GetLong();
    }
    public double GetLat() {
        return location.GetLat();
    }
    public double GetTemp() {
        return temp;
    }

    public double CnD(WeatherInfo[] infos, int distance, double temp) {
        int numOfLocations = 0;
        for(int i = 0; i < infos.length; i++) {
            if(this.location.FindDistance(infos[i].location) < distance && infos[i].GetTemp > temp) {
                numOfLocations++;
            }
        } 
        return numOfLocations / infos.length;
    }
}
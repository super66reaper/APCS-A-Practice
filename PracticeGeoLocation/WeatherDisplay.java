public class WeatherDisplay {
    public static void main(String[] args) {

        Location location = new Location(44.8, 20.4, "Yugoslavia");
        WeatherInfo info = new WeatherInfo(location, 50.5);

        System.out.println("Location: " + info.GetName() + 
                            " Lat: " + info.GetLat() + 
                            " Long: " + info.GetLong() + 
                            " Temp: " + info.GetTemp());

        System.out.println("Cnd: " + info.Cnd*(, 50, 50.5));
    }
}
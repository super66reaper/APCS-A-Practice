public class Car {

    private String make;
    private String type;
    private int tankSize;
    private double time;

    public Car(String make, String type, int tankSize, double time) {
        setMake(make);
        setType(type);
        setTankSize(tankSize);
        setTime(time);
    }

    //G&S
    public String getMake() {
        return this.make;
    }

    public String getType() {
        return this.type;
    }

    public int getTankSize() {
        return this.tankSize;
    }   

    public double getTime() {
        return this.time;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double carMPG() {
        
    }
}
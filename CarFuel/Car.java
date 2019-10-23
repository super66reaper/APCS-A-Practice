public class Car {

    private String make;
    private String type;
    private int tankSize;
    private double time;
    private double mpg;

    final private double sedanStandard = 50;
    final private double suvStandard = 40;
    final private double truckStandard = 30;

    public Car(String make, String type, int tankSize, double time) {
        setMake(make);
        setType(type);
        setTankSize(tankSize);
        setTime(time);
        setMpg();
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

    public double getMpg() {
        return this.mpg;
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

    public void setMpg() {
        this.mpg = calculateMpg();
    }

    //Functions
    public double calculateMpg() {
        return (time * 60.0) / tankSize * 4.544;
    }

    public String reportStatus() {
        if(type.equals("Sedan")) {
            if(mpg >= sedanStandard) {
                return "does";
            }else {
                return "does not";
            }
        }else if(type.equals("SUV")) {
            if(mpg >= suvStandard) {
                return "does";
            }else {
                return "does not";
            }
        }else {
            if(mpg >= truckStandard) {
                return "does";
            }else {
                return "does not";
            }
        }
    }
}
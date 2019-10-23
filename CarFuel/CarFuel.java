public class CarFuel {
    public static void main(String[] args) {
        Car car1 = new Car("Takk", "Sedan", 50, 8);
        Car car2 = new Car("Beklager", "Sedan", 40, 7.5);
        Car car3 = new Car("Vakker", "SUV", 60, 5);
        Car car4 = new Car("Stygg", "SUV", 55, 6);
        Car car5 = new Car("Vanskellig", "Truck", 65, 4.75);
        Car car6 = new Car("Lastebil", "Truck", 70, 5.5);
    
        System.out.println("The " + car1.getMake() + " " + car1.getType() + " with " + car1.getMpg() + " " + car1.reportStatus() + " fit the government standards.");
        System.out.println("The " + car2.getMake() + " " + car2.getType() + " with " + car2.getMpg() + " " + car2.reportStatus() + " fit the government standards.");
        System.out.println("The " + car3.getMake() + " " + car3.getType() + " with " + car3.getMpg() + " " + car3.reportStatus() + " fit the government standards.");
        System.out.println("The " + car4.getMake() + " " + car4.getType() + " with " + car4.getMpg() + " " + car4.reportStatus() + " fit the government standards.");
        System.out.println("The " + car5.getMake() + " " + car5.getType() + " with " + car5.getMpg() + " " + car5.reportStatus() + " fit the government standards.");
        System.out.println("The " + car6.getMake() + " " + car6.getType() + " with " + car6.getMpg() + " " + car6.reportStatus() + " fit the government standards.");
    }
}
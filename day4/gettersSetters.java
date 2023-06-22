
class Car {


    private String doors;
    private String engine;
    private String driver;
    private int speed;


    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;

    }
        
    public void setDoor(String doors) {
        this.doors = doors;

    }

    public String getDoor() {
        return doors;

    }

    public void setDriver(String driver) {
        this.driver = driver;

    }

    public String getDriver() {
        return driver;

    }

    public void setEngine(String engine) {
        this.engine = engine;

    }

    public String getEngine() {
        return engine;

    }

}



public class gettersSetters {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setSpeed(11);
        System.out.println(car1.getSpeed());

        Car car2 = new Car();
        car2.setDoor("Closed");
        System.out.println(car2.getDoor());

        Car car3 = new Car();
        car3.setDriver("Joined");
        System.out.println(car3.getDriver());

        Car car4 = new Car();
        car4.setEngine("Started");
        System.out.println(car4.getEngine());


    }
}

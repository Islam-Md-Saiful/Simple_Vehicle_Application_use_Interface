public class Car extends Vehicle{

    private int wheels;
    private String type;
    private int door;
    private int gears;
    private boolean isManual;
    private int currentGear;


    public Car(String name, int wheels, int door, int gears, boolean isManual, String type) {
        this.type = type;
        this.gears = gears;
        this.door = door;
        this.isManual = isManual;
        this.wheels = wheels;
        currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("ChangeGear Method is called: change to "+ this.currentGear + "gear");
    }
    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("changeSpeed Method is called: change to "+ newSpeed + "direction" + newDirection);
    }
}

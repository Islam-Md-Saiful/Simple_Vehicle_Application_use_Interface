public class SUV extends Car{
    public SUV(String name, int wheels, int door, int gears, boolean isManual, String type) {
        super(name, 4, 5, gears, isManual, "SUV");
    }

    public void accelaration(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        }
        else if(newSpeed > 0 &&newSpeed <= 10){
            changeGear(1);
        }else if(newSpeed > 10 &&newSpeed <= 20){
            changeGear(2);
        }else if(newSpeed > 20 &&newSpeed <= 30){
            changeGear(3);
        }else if(newSpeed > 30 &&newSpeed <= 40){
            changeGear(4);
        }else if(newSpeed > 40 &&newSpeed <= 50){
            changeGear(5);
        }else {
            changeGear(6);
        }
        if (newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

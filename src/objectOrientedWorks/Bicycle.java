package objectOrientedWorks;

public class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear){
        this.gear = gear;
    }

    @Override
    public void speedUp(int increase){
        speed = speed + increase;
    }

    @Override
    public void applyBrakes(int decrease){
        speed = speed - decrease;
    }

    public void printFunctions(){

        System.out.println("speed:"+" " + speed + " gear:"+" " + gear);
    }

}

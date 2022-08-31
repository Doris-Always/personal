package objectOrientedWorks;

public class Bike implements Vehicle{
    int gear;
    int speed;

    @Override
    public void changeGear(int gear){
        this.gear = gear;

    }
    @Override
    public void speedUp(int increase){
//        speed = 0;
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

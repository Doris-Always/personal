package objectOrientedWorks;

public class checkVehicleImplementation {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(2);
        bike.speedUp(3);
        bike.applyBrakes(1);
        System.out.println("my bike's state");
        bike.printFunctions();


        Bicycle papaBicycle = new Bicycle();
        papaBicycle.changeGear(1);
        papaBicycle.speedUp(4);
        papaBicycle.applyBrakes(2);
        System.out.println("my bicycle state");
        papaBicycle.printFunctions();

    }
}

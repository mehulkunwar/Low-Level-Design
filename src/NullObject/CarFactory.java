package NullObject;

public class CarFactory {

    public static Car getCar(String carType){
        if(carType.equals("Luxury")) return new LuxuryCar();
        else if(carType.equals("Economy")) return new EconomyCar();

        return new NullObjectCar();
    }
}

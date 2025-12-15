package Factory;

public class FactoryClass {

    public static Interface getInterfaceObject(InterfaceType obj){
        if(obj == (InterfaceType.A)) return new ClassA();
        else if(obj == InterfaceType.B) return new ClassB();

        throw new IllegalArgumentException("No such interface exists");
    }
}

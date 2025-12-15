package Abstractfactory;

public class FactoryProvider {
    static AbstractFactoryProduct getFactory(String factoryType){
        if(factoryType.equals("1")) return new Factory1();
        return new Factory2();
    }
}

package Abstractfactory;

public class Factory2 implements AbstractFactoryProduct{
    @Override
    public InterfaceA createProductA() {
        return new ProductA2();
    }

    @Override
    public InterfaceB createProductB() {
        return new ProductB2();
    }
}

package Abstractfactory;

public class Factory1 implements AbstractFactoryProduct{
    @Override
    public InterfaceA createProductA() {
        return new ProductA1();
    }

    @Override
    public InterfaceB createProductB() {
        return new ProductB1();
    }
}

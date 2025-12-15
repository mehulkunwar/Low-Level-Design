package Abstractfactory;

public class ClientCode {
    public static void main(String[] args) {
        AbstractFactoryProduct abstractFactoryProduct = FactoryProvider.getFactory("1");
        InterfaceA productA = abstractFactoryProduct.createProductA();
        productA.operation();
    }
}

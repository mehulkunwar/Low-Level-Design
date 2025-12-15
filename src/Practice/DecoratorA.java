package Practice;

public class DecoratorA extends Decorator{
    public DecoratorA(ComponentInterface componentInterface) {
        super(componentInterface);
    }

    @Override
    public void operation() {
        System.out.println("Decorator A" ) ;
        componentInterface.operation();
    }
}

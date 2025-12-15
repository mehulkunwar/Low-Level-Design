package Practice;

public class DecoratorB extends Decorator{
    public DecoratorB(ComponentInterface componentInterface) {
        super(componentInterface);
    }

    @Override
    public void operation() {
        System.out.println("Decorator B");
        componentInterface.operation();

    }
}

package Decorator;

public class DecoratorAClass extends DecoratorClass{

    public DecoratorAClass(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Decorator A") ;
        component.operation();
    }
}

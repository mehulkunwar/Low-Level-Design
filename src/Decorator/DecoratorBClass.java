package Decorator;

public class DecoratorBClass extends DecoratorClass{
    public DecoratorBClass(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Decorator B");
        component.operation();
    }
}

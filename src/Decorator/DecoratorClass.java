package Decorator;

public abstract class DecoratorClass implements Component{
    Component component;

    public DecoratorClass(Component component) {
        this.component = component;
    }
}

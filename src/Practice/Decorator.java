package Practice;

public abstract class Decorator implements ComponentInterface{
    ComponentInterface componentInterface;

    public Decorator(ComponentInterface componentInterface) {
        this.componentInterface = componentInterface;
    }
}

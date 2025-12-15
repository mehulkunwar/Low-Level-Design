package Practice;

public class Main {
    public static void main(String[] args) {
        ComponentInterface component = new DecoratorB(new DecoratorA(new Component()));
        component.operation();
    }
}

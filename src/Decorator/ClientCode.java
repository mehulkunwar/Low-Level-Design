package Decorator;

public class ClientCode {
    public static void main(String[] args) {
        Component componentAwithB = new DecoratorBClass(new DecoratorAClass(new ConcreteComponent())) ;
        componentAwithB.operation();
    }
}

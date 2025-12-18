package ChainOfResponsibility;

public class Responsibility2 extends Responsibility{
    @Override
    protected void message(String resp) {
        if(resp.equals("2")){
            System.out.println("Responsibility 2");
        }else {
            System.out.println("Failed to execute");
        }
    }
}

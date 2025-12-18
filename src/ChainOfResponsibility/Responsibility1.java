package ChainOfResponsibility;

public class Responsibility1 extends Responsibility{
    @Override
    protected void message(String resp) {
       if(resp.equals("1")){
           System.out.println("Responsibility 1");
       }else{
          responsibility.message(resp);
       }
    }



}

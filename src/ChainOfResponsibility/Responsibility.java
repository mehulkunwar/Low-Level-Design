package ChainOfResponsibility;

public abstract class Responsibility {

    Responsibility responsibility;

    protected void getNext(Responsibility responsibility){
        this.responsibility = responsibility;
    }

    abstract protected void message(String resp);
}

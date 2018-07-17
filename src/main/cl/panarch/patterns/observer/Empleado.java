package main.cl.panarch.patterns.observer;


public class Empleado implements Observer {
    private String name;
    private Observable secretary;

    public Empleado(Observable secretary, String name){
        this.setName(name);
        this.secretary = secretary;
        this.secretary.addObservers(this);
    }

    @Override
    public void update(String message) {
        if(message != null && !message.trim().equals("") && message.contains("Andres")){
            decidirComprar();
        }
        else if(message != null && !message.trim().equals("") && message.contains("Adivina")){
            escucharCopucha();
        }
    }

    private void escucharCopucha() {
        System.out.println("ohhhhh "+getName() + " lo va a extrañar");
    }

    private void decidirComprar() {
        System.out.println(getName()+" pensando en comprar");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.getName();
    }
}

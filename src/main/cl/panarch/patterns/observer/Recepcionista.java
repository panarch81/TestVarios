package main.cl.panarch.patterns.observer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recepcionista implements Observable {
    private List<Empleado> empleados;
    private Date fecha;
    private String message;
    private String name;
    private boolean change;

    public Recepcionista(){
        this.empleados = new ArrayList<Empleado>();
    }

    public void avisarPastryAndresLlego(){
        this.fecha = new Date();
        if( validateFecha(this.fecha) ){
            setChanged();
            this.message = "Llegó Pastry Andres "+this.fecha;
            System.out.println(this.name + " dice: "+this.message);
        }

        notifyObservers();
    }

    private boolean validateFecha(Date fecha) {

        return true;
    }

    public void cuentaCopucha(String copucha, Empleado empleado) {
        this.message = copucha + empleado;
        removeObservers(empleado);
        System.out.println(this.message);
        setChanged();
        notifyObservers();
    }

    @Override
    public void addObservers(Observer observer) {
        if(observer instanceof Empleado) {
            empleados.add((Empleado)observer);
        }

    }

    @Override
    public void notifyObservers() {
        if(hasChanged()){
            for(Empleado e : empleados){
                e.update(this.message);
            }
        }
        clearChanged();
    }

    @Override
    public void removeObservers(Observer observer) {
        int ubicacionARemover = empleados.indexOf(observer);
        if(ubicacionARemover >= 0){
            empleados.remove(ubicacionARemover);
        }
    }

    @Override
    public void setChanged() {
        this.change = true;
    }

    @Override
    public void clearChanged() {
        this.change = false;
    }

    @Override
    public boolean hasChanged() {
        return this.change;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

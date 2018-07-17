package main.cl.panarch.patterns.observer;

public class Oficina {

    public static void main(String[] args){
        Recepcionista secretaria = new Recepcionista();
        secretaria.setName("Luz");
        Empleado empleado1 = new Empleado(secretaria, "Miguelo");
        Empleado empleado2 = new Empleado(secretaria, "Renato");
        Empleado empleado3 = new Empleado(secretaria, "Paola");
        Empleado empleado4 = new Empleado(secretaria, "Ramoncho");

        secretaria.avisarPastryAndresLlego();
        secretaria.cuentaCopucha("\n Adivina quien se va a US ?? ...",empleado2);
    }


}
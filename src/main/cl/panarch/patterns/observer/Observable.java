package main.cl.panarch.patterns.observer;


public interface Observable {

    void addObservers(Observer observer);
    void notifyObservers();
    void removeObservers(Observer observer);
    void setChanged(); // set change state into true
    void clearChanged(); // back to false
    boolean hasChanged(); //current state
}

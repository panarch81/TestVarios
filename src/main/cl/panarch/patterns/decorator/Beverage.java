package main.cl.panarch.patterns.decorator;


public abstract class Beverage {

    private String beverageName;

    public String getBeverageName(){
        return this.beverageName;
    }

    public abstract double getBevergeCost();
}

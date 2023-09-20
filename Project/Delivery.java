package com.example.tryfx;
////Adam Nassan 1202076 Lab Section: 5
import java.util.Date;

public class Delivery extends PizzaOrder {
    private double tripRate;
    private int zone;

    public Delivery() {
    }

    public Delivery(String customerName,int pizzaSize , int numberOfToppings, double toppingPrice, double tripRate, int zone) {
        super(customerName,pizzaSize, numberOfToppings, toppingPrice);
        this.setDateOrdered(new Date(120,4,3,5,56,7));
        this.tripRate = tripRate;
        this.zone = zone;
    }
    //calculate order price depending on the equation
    @Override
    public double calculateOrderPrice(){
        return numberOfToppings*toppingPrice*pizzaSize+( tripRate/100 * (numberOfToppings*toppingPrice*pizzaSize) * zone ) ;
    }
    //To string invoked the super class and its additional information
    @Override
    public String toString() {
        return "Delivery{ "+ super.toString()+
                " tripRate=" + tripRate +
                ", zone=" + zone +
                " calculateOrderPrice: " +calculateOrderPrice() +" }";
    }
}


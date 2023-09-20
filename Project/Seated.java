package com.example.tryfx;
////Adam Nassan 1202076 Lab Section: 5
import java.util.Date;

public class Seated extends PizzaOrder{
    private double serviceCharge;
    private int numberOfPeople;

    public Seated(String customerName,int pizzaSize ,int numberOfToppings, double toppingPrice, double serviceCharge, int numberOfPeople) {
        super(customerName,pizzaSize, numberOfToppings, toppingPrice);
        this.setDateOrdered(new Date(119,2,6,2,34,18));
        this.serviceCharge = serviceCharge;
        this.numberOfPeople = numberOfPeople;
    }
    //calculate order price depending on the equation
    @Override
    public double calculateOrderPrice(){
        return  numberOfToppings*toppingPrice*pizzaSize + serviceCharge * numberOfPeople;
    }
    //To string invoked the super class and its additional information
    @Override
    public String toString() {
        return "Seated{ " + super.toString()+
                " serviceCharge=" + serviceCharge +
                ", numberOfPeople=" + numberOfPeople +
                " calculateOrderPrice: " +calculateOrderPrice() +" }" ;
    }
}

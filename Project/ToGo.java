package com.example.tryfx;

////Adam Nassan 1202076 Lab Section: 5
public class ToGo extends PizzaOrder {
    public ToGo(String customerName, int pizzaSize , int numberOfToppings, double toppingPrice) {
        super(customerName, pizzaSize, numberOfToppings, toppingPrice);
    }
    //calculate order price depending on the equation
    public double calculateOrderPrice() {
        return numberOfToppings * toppingPrice * pizzaSize;
    }
//To string invoked the super class

    @Override
    public String toString() {
        return "ToGo{ " + super.toString()+ " calculateOrderPrice: " +calculateOrderPrice() ;
    }
}

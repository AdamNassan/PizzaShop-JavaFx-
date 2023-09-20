package com.example.tryfx;
////Adam Nassan 1202076 Lab Section: 5
import java.util.Date;

abstract public class PizzaOrder implements Comparable<PizzaOrder>{
    private String customerName;
    private Date dateOrdered;

    int pizzaSize;
    final static int SMALL=1 ;
    final static int MEDIUM=2 ;
    final static int LARGE=3;
    int numberOfToppings;
    double toppingPrice;

    public PizzaOrder() {
    }

    public PizzaOrder(String customerName,int pizzaSize, int numberOfToppings, double toppingPrice) {
        this.customerName = customerName;
        this.pizzaSize = pizzaSize;
        this.dateOrdered = new Date();
        this.numberOfToppings = numberOfToppings;
        this.toppingPrice = toppingPrice;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
    //default toString to print all information
    @Override
    public String toString() {
        return "customerName='" + customerName + '\'' +
                ", dateOrdered=" + dateOrdered +
                ", pizzaSize=" + pizzaSize +
                ", numberOfToppings=" + numberOfToppings +
                ", toppingPrice=" + toppingPrice +
                '}';
    }
    //calculate order price depending on the equation
    public double calculateOrderPrice(){
        return numberOfToppings*toppingPrice*pizzaSize;
    }
    //print customer name and calculated price
    public String printOrderInfo (){
        return "Customer name= "+customerName+"Calculated price= "+calculateOrderPrice();
    }
    //compare the orders depending on order price
    @Override
    public int compareTo(PizzaOrder o) {
        if(this.calculateOrderPrice()>o.calculateOrderPrice())
            return 1;
        else if (this.calculateOrderPrice()<o.calculateOrderPrice()) {
            return -1;
        }
        else
            return 0;
    }
}

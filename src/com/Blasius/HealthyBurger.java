package com.Blasius;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name = "", healthyExtra2Name = "";
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Fit", meat, price, "Brown rye");
    }

    //Add two new items to the list
    public void addHealthyAddition1(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.healthyExtra1Name = item;
            this.healthyExtra1Price = price;
        }
    }

    public void addHealthyAddition2(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.healthyExtra2Name = item;
            this.healthyExtra2Price = price;
        }
    }
    //

    //Add items on a hamburger
    @Override
    public void addHamburgerAddition1(String item, double price) {
        super.addHamburgerAddition1(item, price);
    }

    @Override
    public void addHamburgerAddition2(String item, double price) {
        super.addHamburgerAddition2(item, price);
    }

    @Override
    public void addHamburgerAddition3(String item, double price) {
        super.addHamburgerAddition3(item, price);
    }

    @Override
    public void addHamburgerAddition4(String item, double price) {
        super.addHamburgerAddition4(item, price);
    }
    //

    //print a list with the price and the items added
    @Override
    public double itemizeHamburger() {

        if (!this.healthyExtra1Name.isEmpty() && this.healthyExtra1Price >= 0d) {
            System.out.println("Added " + this.healthyExtra1Name + " for an extra: " + this.healthyExtra1Price);
        }

        if (!this.healthyExtra2Name.isEmpty() && this.healthyExtra2Price >= 0d) {
            System.out.println("Added " + this.healthyExtra2Name + " for an extra: " + this.healthyExtra2Price);
        }

        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}

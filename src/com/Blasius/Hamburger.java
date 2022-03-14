package com.Blasius;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name = "", addition2Name = "", addition3Name = "", addition4Name = "";
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " Hamburger on a " + this.breadRollType + " roll With " + this.meat + ", price is " + this.price);
    }

    //Add items on a hamburger
    public void addHamburgerAddition1(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.addition1Name = item;
            this.addition1Price = price;
        }
    }

    public void addHamburgerAddition2(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.addition2Name = item;
            this.addition2Price = price;
        }
    }

    public void addHamburgerAddition3(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.addition3Name = item;
            this.addition3Price = price;
        }
    }

    public void addHamburgerAddition4(String item, double price) {
        if (item.isEmpty()) {
            System.out.println("Invalid data");
        }else if (price <= 0d){
            System.out.println("Invalid data");
        } else {
            this.addition4Name = item;
            this.addition4Price = price;
        }
    }
    //

    //print a list with the price and the items added
    public double itemizeHamburger(){

        if (!this.addition1Name.isEmpty() && this.addition1Price >= 0d) {
            System.out.println("Added " + this.addition1Name + " for an extra: " + this.addition1Price);
        }

        if (!this.addition2Name.isEmpty() && this.addition2Price >= 0d) {
            System.out.println("Added " + this.addition2Name + " for an extra: " + this.addition2Price);
        }

        if (!this.addition3Name.isEmpty() && this.addition3Price >= 0d) {
            System.out.println("Added " + this.addition3Name + " for an extra: " + this.addition3Price);
        }

        if (!this.addition4Name.isEmpty() && this.addition4Price >= 0d) {
            System.out.println("Added " + this.addition4Name + " for an extra: " + this.addition4Price);
        }

        return (this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price);
    }
    //

}

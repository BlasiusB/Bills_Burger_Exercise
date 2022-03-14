package com.Blasius;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausege & Bacon", 14.54d,"White");
        super.addHamburgerAddition1("chips", 2.75d);
        super.addHamburgerAddition2("Drink", 1.82d);
    }

    //Add items on a hamburger
    @Override
    public void addHamburgerAddition1(String item, double price) {
        if (!item.isEmpty()){
            System.out.println("The Deluxe Burger don't have additions");
        }
    }

    @Override
    public void addHamburgerAddition2(String item, double price) {
        if (!item.isEmpty()){
            System.out.println("The Deluxe Burger don't have additions");
        }
    }

    @Override
    public void addHamburgerAddition3(String item, double price) {
        if (!item.isEmpty()){
            System.out.println("The Deluxe Burger don't have additions");
        }
    }

    @Override
    public void addHamburgerAddition4(String item, double price) {
        if (!item.isEmpty()){
            System.out.println("The Deluxe Burger don't have additions");
        }
    }
    //

    //print a list with the price and the items added
    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
    //
}

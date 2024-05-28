package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isExtraCheese = false;

    private Boolean isExtraToppings = false;

    private Boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price += 300;
            bill = "Base Price of the Pizza: 300\n";
        }else{
            price += 400;
            bill = "Base Price of the Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            price += 80;
            bill += "Extra Cheese Added: 80\n";
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings) {
            addExtraCheese();
            if (isVeg) {
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            } else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            price += 20;
            bill += "Paperbag Added: 20\n";
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: "+price;
        return this.bill;
    }
}

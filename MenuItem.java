package com.example.kiosk.lv4;

public class MenuItem {
    String name;
    String price;
    String description;

    MenuItem(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void printMenuItem() {
        System.out.println(this.name + this.price + this.description);
    }
}

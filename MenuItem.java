package com.example.kiosk.lv6;

public class MenuItem {
    String name;
    double price;
    String description;
    int quantity = 0;

    // 생성자

    // 게터
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // 세터

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity() {
        this.quantity += 1;
    }

    // 메서드
    public String printMenuItem() {
        return(this.name + "   | " + "W "+ this.price + " | "  + this.description);
    }

}

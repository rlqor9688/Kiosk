package com.example.kiosk.lv5;

public class MenuItem {
    private String name;
    private String price;
    private String description;

    // 게터
    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printMenuItem() {
        System.out.println(this.name + this.price + this.description);
    }
}

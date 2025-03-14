package com.example.kiosk.lv7;

import java.util.List;

public class Menu {
    // 속성
    List<MenuItem> category;
    String categoryName;
    int number;

    // 생성자

    // 게터
    public String getCategoryName() {
        return this.categoryName;
    }

    public List<MenuItem> category() {
        return this.category;
    }

    public int getNumber() {
        return this.number;
    }

    // 세터
    public void setCategory(List<MenuItem> category) {
        this.category = category;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 기능
    public void printMenuItems() {
        this.category.stream()
                .forEach(menuItem -> System.out.println(menuItem.getNumber() + ". "+ menuItem.printMenuItem()));
    }
}
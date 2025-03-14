package com.example.kiosk.lv6;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    // 속성
    List<MenuItem> category;
    String categoryName;

    // 생성자

    // 게터
    public String getCategoryName() {
        return this.categoryName;
    }

    public List<MenuItem> category() {
        return this.category;
    }

    // 세터
    public void setCategory(List<MenuItem> category) {
        this.category = category;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // 기능
    public void printMenuItems() {
        int i = 1;
        for (MenuItem menuItem: this.category) {
            System.out.println(i + ". " + menuItem.printMenuItem());
            i++;
        }
    }

}

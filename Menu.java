package com.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItemList;
    private String categoryName;

    // 세터
    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // 게터
    public List<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    // 메서드
    public void printMenuItems() {
        for (MenuItem menuItem : this.menuItemList) {
            menuItem.printMenuItem();
        }
    }
}
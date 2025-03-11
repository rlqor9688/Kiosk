package com.example.kiosk.lv4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList;
    String categoryName;

    Menu(String categoryName) {
        this.menuItemList = new ArrayList<MenuItem>();
        this.categoryName = categoryName;
    }

    public List<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void printMenuItems() {
        for (MenuItem menuItem : this.menuItemList) {
            menuItem.printMenuItem();
        }
    }
}

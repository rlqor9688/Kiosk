package com.example.kiosk.lv4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Menu Burgers = new Menu("Burgers");
        Menu Drinks = new Menu("Drinks");
        Menu Desserts = new Menu("Desserts");

        Burgers.menuItemList.add(new MenuItem("1. ShackBurger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burgers.menuItemList.add(new MenuItem("2. SmokeShack   |", " W 8.9 |", " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        Burgers.menuItemList.add(new MenuItem("3. Cheeseburger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burgers.menuItemList.add(new MenuItem("4. Hamburger   |", " W 5.4 |", " 비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk();
        kiosk.menuList.add(Burgers);
        kiosk.menuList.add(Drinks);
        kiosk.menuList.add(Desserts);

        kiosk.start();
    }
}

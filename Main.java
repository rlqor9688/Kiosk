package com.example.kiosk.lv6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 메뉴 생성
        MenuItem ShackBurger = new MenuItem();
        MenuItem SmokeBurger = new MenuItem();
        MenuItem CheeseBurger = new MenuItem();
        MenuItem HamBurger = new MenuItem();

        // 세터
        ShackBurger.setName("ShackBurger");
        ShackBurger.setPrice(6.9);
        ShackBurger.setDescription(" 토마토, 양상추, 쉑소스가 토핑된 치즈버거");

        SmokeBurger.setName("SmokeShack");
        SmokeBurger.setPrice(8.9);
        SmokeBurger.setDescription(" 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");

        CheeseBurger.setName("Cheeseburger");
        CheeseBurger.setPrice(6.9);
        CheeseBurger.setDescription(" 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");

        HamBurger.setName("Hamburger");
        HamBurger.setPrice(5.4);
        HamBurger.setDescription(" 비프패티를 기반으로 야채가 들어간 기본버거");


        // 메뉴 카테고리 생성
        Menu Burgers = new Menu();
        Menu Drinks = new Menu();
        Menu Desserts = new Menu();

        // 메뉴 카테고리 이름 세팅
        Burgers.setCategoryName("Burgers");
        Drinks.setCategoryName("Drinks");
        Desserts.setCategoryName("Desserts");

        // 메뉴 리스트 세팅
        Burgers.setCategory(new ArrayList<MenuItem>(Arrays.asList(ShackBurger, SmokeBurger, CheeseBurger, HamBurger)));
        Drinks.setCategory(new ArrayList<MenuItem>());
        Desserts.setCategory(new ArrayList<MenuItem>());

        Kiosk kiosk = new Kiosk();
        kiosk.setCategory(new ArrayList<Menu>(Arrays.asList(Burgers, Drinks, Desserts)));
        kiosk.start();

    }
}

package com.example.kiosk.lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<>();

    Kiosk() {
        this.menuItems = Arrays.asList(
                new MenuItem("1. ShackBurger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("2. SmokeShack   |", " W 8.9 |", " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("3. Cheeseburger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("4. Hamburger   |", " W 5.4 |", " 비프패티를 기반으로 야채가 들어간 기본버거")
        );
    } // 이렇게 하면 Kiosk(List<MenuItem> menuItems)를 넣어줘야 메뉴가 생성되는 건가? 그럼 생성은 main 함수에서 해줘야 하는 건가? 하는 의문
    // 아니다. menuItems의 이름만 지정해주면, 나중에 Kiosk.menuItems로 리스트를 불러올 수 있는 것이다. -> 이것도 아닌 듯

    public void start() {
        Scanner sc = new Scanner(System.in);
        for (MenuItem menu: this.menuItems) {
            System.out.println(menu.name + menu.price + menu.description);
        }
        System.out.println("0. 종료");
        int input = 55;
        while (input !=0) {
            System.out.print("메뉴 번호를 입력해주세요. ");
            input =  sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(menuItems.get(0).name + menuItems.get(0).price + menuItems.get(0).description+"\n");
                    break;
                case 2:
                    System.out.println(menuItems.get(1).name + menuItems.get(1).price + menuItems.get(1).description+"\n");
                    break;
                case 3:
                    System.out.println(menuItems.get(2).name + menuItems.get(2).price + menuItems.get(2).description+"\n");
                    break;
                case 4:
                    System.out.println(menuItems.get(3).name + menuItems.get(3).price + menuItems.get(3).description+"\n");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요. \n");
                    break;
            }
        }
    }
}

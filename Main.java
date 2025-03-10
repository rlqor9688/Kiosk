package com.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String shackBurger = "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String smokeShack = "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String cheeseBurger = "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        String hamburger = "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
        String finish = "0. 종료           | 종료";
        Scanner sc = new Scanner(System.in);
        int input = 55;
        while (input!=0) {
            System.out.println("[ SHAKESHACK MENU ] \n" + shackBurger +"\n" + smokeShack + "\n" + cheeseBurger +"\n" + hamburger +"\n" +finish);
            System.out.print("메뉴 번호를 입력하세요: ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(shackBurger + "\n");
                    break;
                case 2:
                    System.out.println(smokeShack+ "\n");
                    break;
                case 3:
                    System.out.println(cheeseBurger+ "\n");
                    break;
                case 4:
                    System.out.println(hamburger+ "\n");
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("올바르지 않은 입력입니다. 다시 시도해주세요. \n");
                    break;
            }
        }
    }
}

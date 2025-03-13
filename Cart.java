package com.example.kiosk.lv6;

import java.util.HashMap;
import java.util.Scanner;

public class Cart {
    // 속성
    HashMap<MenuItem, Integer> cartItems;

    // 생성자
    Cart() {
        this.cartItems = new HashMap<MenuItem, Integer>();
    }

    // 기능
    Scanner sc = new Scanner(System.in);

    // 1. 장바구니 담기
    public void addCartItem(MenuItem menuItem) {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
        int cartAddInput = 55;
        while (cartAddInput != 1 && cartAddInput !=2) {
            System.out.print("번호를 입력해주세요. ");
            cartAddInput = sc.nextInt();
            switch (cartAddInput) {
                case 1:
                    System.out.println(menuItem.getName() + "이 장바구니에 추가되었습니다.");
                    menuItem.addQuantity();
                    this.cartItems.put(menuItem, menuItem.quantity);
                    break;
                case 2:
                    System.out.println("주문을 취소합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }

    // 2. 장바구니 출력
    public void printCartItems() {
        double sum = 0;
        System.out.println("[ Orders ]");
        for (MenuItem cartItem : this.cartItems.keySet()) {
            System.out.println(cartItem.printMenuItem() + " | 개수: " + cartItem.getQuantity());
            sum += cartItem.price * cartItem.quantity;
        };
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + sum);
        System.out.println();

        int orderInput = 55;
        while (orderInput != 1 && orderInput !=2) {
            System.out.println("1. 주문     2. 메뉴판");
            System.out.print("번호를 입력해주세요. ");
            orderInput = sc.nextInt();
            switch (orderInput) {
                case 1:
                    System.out.println("주문이 완료되었습니다. 금액은 W "+sum +"입니다.");
                    this.cartItems = new HashMap<MenuItem, Integer>();
                    break;
                case 2:
                    System.out.println("메뉴판을 표시합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

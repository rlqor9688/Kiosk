package com.example.kiosk.lv7;

import java.util.HashMap;
import java.util.Scanner;

enum CustomerType{
    // 속성
    Honored(1,"국가유공자", 10),
    Solider(2,"군인", 5),
    Student(3, "학생", 3),
    Normal(4,"일반", 0);

    // 생성자
    final int number;
    final String type;
    final int discountRate;

    CustomerType(int number, String type, int discountRate) {
        this.number = number;
        this.type = type;
        this.discountRate = discountRate;
    }

    // 기능
}

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

    // 3. 할인율 계산
    public double calculateDiscount(double originalPrice) {
        System.out.println("할인 정보를 입력해주세요. ");
        for (CustomerType customer : CustomerType.values()) {
            System.out.println(customer.number + ". "+ customer.type + "할인율: "+ customer.discountRate + "%");
        }
        int customerTypeInput = 55;
        double discountPrice = 0;
        while (customerTypeInput !=1 && customerTypeInput !=2 && customerTypeInput !=3 && customerTypeInput !=4) {
            System.out.print("입력: ");
            customerTypeInput = sc.nextInt();
            switch (customerTypeInput) {
                case 1:
                    discountPrice = originalPrice * (1-CustomerType.Honored.discountRate * 0.01);
                    break;
                case 2:
                    discountPrice = originalPrice * (1-CustomerType.Solider.discountRate * 0.01);
                    break;
                case 3:
                    discountPrice = originalPrice * (1-CustomerType.Student.discountRate * 0.01);
                    break;
                case 4:
                    discountPrice = originalPrice;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        return discountPrice;
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
                    double discountPrice = calculateDiscount(sum);
                    System.out.println("주문이 완료되었습니다. 금액은 W "+discountPrice +"입니다.");
                    for (MenuItem menuItem : cartItems.keySet()) {
                        menuItem.setQuantity(0);
                    } // 장바구니에 담겨 있던 제품들의 개수도 초기화
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

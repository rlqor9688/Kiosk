package com.example.kiosk.lv6;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    // 속성
    List<Menu> categoryList;
    Cart cart;

    // 생성자
    Kiosk() {
        this.categoryList = new ArrayList<Menu>();
        this.cart = new Cart();
    }

    Scanner sc = new Scanner(System.in);
    // 기능

    // 세터
    public void setCategory(List<Menu> categoryList) {
        this.categoryList = categoryList;
    }

    // 게터
    public List<Menu> getMenuList() {
        return this.categoryList;
    }


    // 1. 카테고리 리스트 출력
    private void printCategoryList() {
        int i = 1;
        System.out.println(" [ MAIN MENU ]");
        for (Menu category: this.categoryList) {
            System.out.println(i +". " +category.getCategoryName());
            i++;
        }
        System.out.println("0. 종료    | 종료");
    }

    // 2. 메뉴 인풋 선택
    private void switchMenuItem(Menu menu, int menuInput) {
        switch (menuInput) {
            case 1:
                System.out.println(menu.category.get(0).printMenuItem());
                this.cart.addCartItem(menu.category.get(0));
                break;
            case 2:
                System.out.println(menu.category.get(1).printMenuItem());
                this.cart.addCartItem(menu.category.get(1));
                break;
            case 3:
                System.out.println(menu.category.get(2).printMenuItem());
                this.cart.addCartItem(menu.category.get(2));
                break;
            case 4:
                System.out.println(menu.category.get(3).printMenuItem());
                this.cart.addCartItem(menu.category.get(3));
                break;
            case 0:
                System.out.println("뒤로 이동합니다.");
                break;
            default:
                System.out.print("잘못된 입력입니다. 다시 입력해주세요. ");
                /// 확인하기 menuInput = sc.nextInt();
                break;
        }
    }

    // 3. 카테고리 메뉴 인풋 선택
    private void switchMenu(int categoryInput) {
        int menuInput = 55;
        switch (categoryInput) {
            case 1:
                this.categoryList.get(0).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(0), menuInput);
                }
                break;
            case 2:
                this.categoryList.get(1).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(1), menuInput);
                }
                break;
            case 3:
                this.categoryList.get(2).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(2), menuInput);
                }
                break;
            case 0:
                System.out.println("종료합니다.");
                break;
        }
    }

    // 3. 카테고리 메뉴 인풋 선택 w Order Menu

    private void switchMenuWithOrder(int categoryInput) {
        int menuInput = 55;
        switch (categoryInput) {
            case 1:
                this.categoryList.get(0).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(0), menuInput);
                }
                break;
            case 2:
                this.categoryList.get(1).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(1), menuInput);
                }
                break;
            case 3:
                this.categoryList.get(2).printMenuItems();
                System.out.print("주문할 메뉴를 입력해주세요. ");
                while (menuInput != 0 && menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 ) {
                    menuInput = sc.nextInt();
                    this.switchMenuItem(this.categoryList.get(2), menuInput);
                }
                break;
            case 4:
                cart.printCartItems();
                break;
            case 5:
                System.out.println("진행 중인 주문을 취소합니다.");
                break;
            case 0:
                System.out.println("종료합니다.");
                break;
        }
    }


    // 2. 키오스크 동작
    public void start() {
        Scanner sc = new Scanner(System.in);
        int categoryInput = 55; // 카테고리 입력
        while (categoryInput !=0) { // 0 입력 시 프로그램 종료
            this.printCategoryList();
            // 카트가 비어 있을 때
            if (this.cart.cartItems.isEmpty()) {
                System.out.print("번호를 입력해주세요. ");
                categoryInput = sc.nextInt();
                this.switchMenu(categoryInput);
            } else {   // 카트가 비어 있지 않을 때
                System.out.print("[ ORDER MENU ]");
                System.out.println("4. Orders     | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel     | 진행중인 주문을 취소합니다.");
                System.out.print("번호를 입력해주세요. ");
                categoryInput = sc.nextInt();
                this.switchMenuWithOrder(categoryInput);
            }
        }
    }
}

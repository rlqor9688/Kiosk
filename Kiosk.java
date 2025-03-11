package com.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menuList;
    
    // 세터
    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
    
    // 게터
    public List<Menu> getMenuList() {
        return this.menuList;
    }
    
    // 메서드 - 카테고리 리스트 출력
    public void printMenuList() {
        int i =1;
        System.out.println("[  MAIN MENU  ]");
        for (Menu menuList: this.getMenuList()) {
            System.out.println(i +". " + menuList.getCategoryName());
            i++;
        }
        System.out.println("0. 종료");
    }
    
    //메서드
    public void start(){
        Scanner sc = new Scanner(System.in);
        int categoryInput = 55;
        while (categoryInput !=0) {
            printMenuList();
            System.out.print("번호를 입력하세요: ");
            categoryInput = sc.nextInt();
            int menuInput = 55;
            switch (categoryInput) {
                case 1:
                    System.out.println("[  "+ this.getMenuList().get(0).getCategoryName()+ " MENU  ]");
                    this.getMenuList().get(0).printMenuItems();
                    System.out.println("0. 뒤로가기");
                    System.out.print("번호를 입력하세요. ");
                    menuInput = sc.nextInt();
                    try {
                        switch (menuInput) {
                            case 0:
                                System.out.println("뒤로가기");
                                break;
                            case 1:
                                this.getMenuList().get(0).getMenuItemList().get(0).printMenuItem();
                                System.out.println();
                                break;
                            case 2:
                                this.getMenuList().get(0).getMenuItemList().get(1).printMenuItem();
                                System.out.println();
                                break;
                            case 3:
                                this.getMenuList().get(0).getMenuItemList().get(2).printMenuItem();
                                System.out.println();
                                break;
                            case 4:
                                this.getMenuList().get(0).getMenuItemList().get(3).printMenuItem();
                                System.out.println();
                                break;
                            default:
                                System.out.println(menuInput +"번 메뉴가 없습니다.\n" );
                                break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("해당 메뉴가 없습니다.");
                    }
                    break;
                case 2:
                    System.out.println("[  "+ this.getMenuList().get(1).getCategoryName()+ " MENU  ]");
                    this.getMenuList().get(1).printMenuItems();
                    System.out.println("번호를 입력하세요. ");
                    menuInput = sc.nextInt();
                    try {
                        switch (menuInput) {
                            case 0:
                                System.out.println("뒤로가기");
                                break;
                            case 1:
                                this.getMenuList().get(1).getMenuItemList().get(0).printMenuItem();
                                System.out.println();
                                break;
                            case 2:
                                this.getMenuList().get(1).getMenuItemList().get(1).printMenuItem();
                                System.out.println();
                                break;
                            case 3:
                                this.getMenuList().get(1).getMenuItemList().get(2).printMenuItem();
                                System.out.println();
                                break;
                            case 4:
                                this.getMenuList().get(1).getMenuItemList().get(3).printMenuItem();
                                System.out.println();
                                break;
                            default:
                                System.out.println(menuInput +"번 메뉴가 없습니다.\n" );
                                break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("해당 메뉴가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("[  "+ this.getMenuList().get(2).getCategoryName()+ " MENU  ]");
                    this.getMenuList().get(2).printMenuItems();
                    System.out.println("번호를 입력하세요. ");
                    menuInput = sc.nextInt();
                    try {
                        switch (menuInput) {
                            case 0:
                                System.out.println("뒤로가기");
                                break;
                            case 1:
                                this.getMenuList().get(2).getMenuItemList().get(0).printMenuItem();
                                System.out.println();
                                break;
                            case 2:
                                this.getMenuList().get(2).getMenuItemList().get(1).printMenuItem();
                                System.out.println();
                                break;
                            case 3:
                                this.getMenuList().get(2).getMenuItemList().get(2).printMenuItem();
                                System.out.println();
                                break;
                            case 4:
                                this.getMenuList().get(2).getMenuItemList().get(3).printMenuItem();
                                System.out.println();
                                break;
                            default:
                                System.out.println(menuInput +"번 메뉴가 없습니다.\n" );
                                break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("해당 메뉴가 없습니다.");
                    }
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

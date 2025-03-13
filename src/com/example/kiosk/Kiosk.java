package com.example.kiosk;

// 프로그램 메뉴관리, 입력처리 클래스
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Kiosk {
    private List<Menu> menus = new ArrayList<>();
    private Scanner scanner;

    //메뉴
    public Kiosk() {
        this.menus = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        initializeMenus();
    }
        private void initializeMenus() {
            // 버거 메뉴
            Menu burgerMenu = new Menu("Burger");
            burgerMenu.addMenuItem(new MenuItem("shackBurger", 6.9, ": 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            burgerMenu.addMenuItem(new MenuItem("smokeShack", 8.9, ": 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
            burgerMenu.addMenuItem(new MenuItem("cheeseburger", 6.9, ": 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, ": 비프패티를 기반으로 야채가 들어간 기본버거"));

            // 음료 메뉴
            Menu drinkMenu = new Menu("Drinks");
            drinkMenu.addMenuItem(new MenuItem("Coca-Cola", 0.6, ": 펩시는 가짜다. 코카콜라만이 진정한 콜라."));
            drinkMenu.addMenuItem(new MenuItem("Vanilla-Smoothie", 0.8, ": 바닐라시럽이 들어간 우유 얼음을 갈아서 만든 달콤한 스무디"));
            drinkMenu.addMenuItem(new MenuItem("Fruit-ade", 0.7, ": 시즌 한정 과일을 통으로 갈아넣은 과일 에이드"));
            drinkMenu.addMenuItem(new MenuItem("coffee", 0.4, ": ㅁㅁㅁ산 원두를 갈아 깊은 맛을 내는 커피"));

            // 디저트 메뉴
            Menu dessertMenu = new Menu("Dessert");
            dessertMenu.addMenuItem(new MenuItem("Cheese-Sticks", 0.3, ": 모짜렐라 치즈가 들어간 짭짤한 치즈스틱"));
            dessertMenu.addMenuItem(new MenuItem("McNugget", 8.9, ": 바삭하게 튀겨낸 너겟"));
            dessertMenu.addMenuItem(new MenuItem("Conslow", 0.4, ": 옥수수가 잔뜩 들어간 베이직한 샐러드, 콘슬로우"));
            dessertMenu.addMenuItem(new MenuItem("Softcon", 0.3, ": 진한 우유맛의 부드러운 아이스크림"));

            menus.add(burgerMenu);
            menus.add(drinkMenu);
            menus.add(dessertMenu);
        }

    // 메인 메뉴 출력
public void displayMainMenu() {
    System.out.println("\n [MAIN MENU] ");
    for (int i = 0; i < menus.size(); i++) {
        System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
    }
    System.out.println("0. 종료");
}

    //키오스크

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMainMenu();
            System.out.println("카테고리를 선택하세요.");
            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);
                if(choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menus.size()) {
                    menus.get(choice - 1).displayMenu(scanner);
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        } catch(NumberFormatException e){
                System.out.println("숫자로 입력해주세요.");
        }
    }
    scanner.close();
    }
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}

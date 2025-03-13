package com.example.kiosk;

import java.security.PrivateKey;
import java.util.ArrayList;
import  java.util.List;
import  java.util.Scanner;

public class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item) ;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void displayMenu(Scanner scanner) {
        while (true) {
        System.out.println(" \n[ " + categoryName + " MENU ]" );
                for (int i = 0; i < menuItems.size(); i++) {
                    MenuItem item = menuItems.get(i);
                    System.out.println((i+1)+". " + item.getName() + " | w " + item.getPrice() + " | " + item.getDescription() );
                }
        System.out.println("0.뒤로가기");

        System.out.println("메뉴 번호를 선택하세요: ");
        String input = scanner.nextLine();

        try {
             int choice = Integer.parseInt(input);
             if(choice == 0) {
                 return;
             } else if (choice > 0 && choice <= menuItems.size()) {
                 MenuItem selectedItem = menuItems.get(choice - 1);
                     System.out.println("\n선택한 메뉴 : " + selectedItem.getName());
                     System.out.println("가격: W" + selectedItem.getPrice());
                     System.out.println("설명: " + selectedItem.getDescription());
                 } else {
                     System.out.println("올바른 번호를 입력하세요.");
                 }
             } catch (NumberFormatException e){
                System.out.println("숫자로 입력해주세요.");
            }
        }

    }
}

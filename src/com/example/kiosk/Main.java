package com.example.kiosk;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요. 무엇을 주문하시겠습니까?");

        // ArrayList
        ArrayList<MenuItem> menuList = new ArrayList<>();

        //MenuItem 추가
        menuList.add(new MenuItem("shackBurger", 6.9, ": 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("smokeShack", 8.9, ": 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("cheeseburger", 6.9, ": 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5.4, ": 비프패티를 기반으로 야채가 들어간 기본버거"));

        //메뉴 정보 출력
       for(MenuItem item : menuList) {
           item.displayInfo();
           System.out.println();
       }
    }
}



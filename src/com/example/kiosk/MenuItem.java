package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter 추가 (캡슐화)
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    // 정보 출력 메서드
    public void displayInfo() {
        System.out.println(name + " | w " + price);
        System.out.println(description);
    }


}

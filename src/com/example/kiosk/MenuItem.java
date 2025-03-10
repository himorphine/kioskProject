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

    // 정보 출력 메서드
    public void displayInfo() {
        System.out.println(name + " - $" + price);
        System.out.println(description);
    }
}

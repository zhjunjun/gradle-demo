package com.example;

public class App {
    public static void main(String[] args) {
        // 使用Web模块
        Web web = new Web();
        web.WebInit();
        // 使用List模块
        List list = new List();
        list.ListInit();
        System.out.println("com.example.App run ---->");
    }
}

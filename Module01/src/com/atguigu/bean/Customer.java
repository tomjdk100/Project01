package com.atguigu.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
//这是单行注释

/**
 * 11111
 * 这是文档注释
 * 快捷键的使用
 */
public class Customer extends Person {
    @Override
    public void eat() {
        System.out.println("陪客户吃饭");
    }

    public Customer() {
    }

    /*
        这是文档注释
         */
    private static final int ininta_lise = 10;

    public static void main(String[] args) {
        getList();

    }

    private static void getList() {
        System.out.println("helloworld!!!3333");
        ArrayList list1 = new ArrayList<>();
        Date date2 = new Date();
        list1.add(0, "a");
        list1.add(9, "dd");
        test112();
    }

    public static void test112() {
        int num = 100;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String teststring() {
        return "a";
    }

}

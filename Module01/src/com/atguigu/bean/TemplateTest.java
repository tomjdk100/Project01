package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lyfstart
 * @create 2019-10-26-下午 5:03
 */
public class TemplateTest {
    //模版六：private static final
    private static final int INIT=1;
    private static final Customer customer = new Customer();
    public static final int NUM = 1;
    public static final int NUM2 = 2;
    public static final String NATION = "China";
    private static final String AGE = "AAA";
    public static final Boolean FLAG = true;
    public static void main(String[] args) {
        System.out.println("sout,psvm");
        //soutp ,soutm,soutv
        System.out.println("args = " + Arrays.deepToString(args));
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        //foi
        String [] arr = new String [] {"Tom","Jerry","HanMeiMei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }//iter,
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        for (String s : arr) {

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        for (int i = 0; i < arr.length; i++) {


        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        for (String s : arr) {
            System.out.println(s);
        }
        //模版四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(567);
        if (list == null) {
            System.out.println("111");
        }
        //变形：
        if (list != null) {
            System.out.println("inn ! = null");
        }
        if (list != null) {
            System.out.println("xxx.nn");
        }
        if (list == null) {
            System.out.println("xxx.null ;");
        }



        //list.fori
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }
        //ifn
        if (list == null) {
            System.out.println(list);
        }




    }
    public void testSb(){
        System.out.println();
        System.out.println("TemplateTest.testSb");
    }

}

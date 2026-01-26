package com.ok.javanew.datatypes;

public class Test {
    public static void main(String[] args)
    {
        System.out.println(8.909);
        boolean kk =false;
        System.out.println(kk);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((char)10084);
        int r =10;
        float o=r;
        char p =  String.valueOf(r).charAt(0);
        System.out.println(p);
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1=str1.toUpperCase());
        System.out.println(str2.length());
        System.out.println(str2.charAt(4));
        System.out.println(str2.substring(0,2));
        System.out.println(str2.contains("Ho"));
        System.out.println(str2=str2.replace("He","Ho"));
        System.out.println(str2.contains("Ho"));
     }

}


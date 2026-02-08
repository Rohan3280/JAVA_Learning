package com.ok.javanew.multithreading;

public class NumberCounter extends Thread{
    @Override
    public void run() {
        int count=0;
        for(int i=0;i<=1000000000;i++)
        {
            if(i%10==7)
            {
                count++;
            }
        }
        System.out.println("Count of numbers ending with 7 is :"+count);
    }
}

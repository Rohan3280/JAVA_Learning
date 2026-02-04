package com.ok.javanew.multithreading;


public class Without_MultiThreading {
    public static void main(String[] args)
    {
        long startTime=System.currentTimeMillis();
        long sum =0;
        for(int i=0;i<=1000000000;i++)
        {
            sum+=1;
        }
        System.out.println("Sum: "+sum);

        int count=0;
        for(int i=0;i<=1000000000;i++)
        {
            if(i%10==7)
            {
                count++;
            }
        }
        System.out.println("Count of numbers ending with 7 is :"+count);
        System.out.println("Time taken: "+ (System.currentTimeMillis()-startTime)+" ms");
    }

}

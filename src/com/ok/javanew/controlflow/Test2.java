package com.ok.javanew.controlflow;

public class Test2 {
    public static void main(String args[])
    {
        System.out.println(extrt(true,true,12));
    }

    public static boolean extrt (boolean IR, boolean IN, int k)
    {
        boolean isRaining= IR;
        boolean isNight = IN;
        for(int i=0;i<100;i++)
        {
            System.out.println(i*k);
        }
        if(isRaining == true && isNight ==true)
        {
            return true;
        }
        return false;
    }

}


package com.ok.javanew.oops;

public class Car {

        int speed ;
        String colour;
        String model;
        Car(int speed , String colour, String model){
            this.speed=speed;
            this.colour=colour;
            this.model=model;
        }
        void drive()
        {
            System.out.println(
                    "Speed : "+speed +"\n"+

                    " Colour: "+colour+"\n"+

                    " Model: "+model);
        }

    }

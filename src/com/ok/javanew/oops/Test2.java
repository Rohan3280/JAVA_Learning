package com.ok.javanew.oops;


interface Musicplayer{
    void playmusic();
}
interface Camera{
    void capture();
}
interface Telephone{

    void call();
    static boolean isvalid(String Numb)
    {
        return (Numb.length() >=10);
    }

}
class smartphone implements Musicplayer, Camera, Telephone{
    String Number;
    smartphone(String Number)
    {
        this.Number=Number;
    }
    public void playmusic()
    {
        System.out.println("Playing music ...");
    }
    public void capture()
    {
        System.out.println("Image captured ...");
    }
    public void call()
    {
        System.out.println("Calling ..."+Number);
    }



}
public class Test2 {
    public static void main(String args[]) {

        smartphone ss1 = new smartphone("99221");
        ss1.call();
        System.out.println(Telephone.isvalid("99288383"));
    }
}

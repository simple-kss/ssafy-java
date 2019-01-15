package com.computer;

public class Mouse extends Parts
{
//    String maker;
    private boolean wireless;

    public Mouse(String maker, int price, boolean wireless, int num)
    {
        super(maker, price, num);
        this.wireless = wireless;
    }
    
    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    void click()
    {
        System.out.println("Mouse_Click");
    }
    void scroll()
    {
        System.out.println("Mouse_Scroll");
    }
    public void info()
    {
        System.out.println(this.getClass().getSimpleName());
        super.info();
        System.out.println("wireless : " + wireless);
        System.out.println("-----------------------------");
    }

}

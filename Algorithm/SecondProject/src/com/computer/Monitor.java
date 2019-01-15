package com.computer;

public class Monitor extends Parts
{
//    String maker;
    private double size;

    public Monitor(String maker, int price, double size, int num)
    {
        super(maker, price, num);
        this.size = size;
    }
    
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    void powerOn()
    {
        System.out.println("Monitor_Power_On");
    }
    void powerOff()
    {
        System.out.println("Monitor_Power_Off");
    }
    public void info()
    {
        System.out.println(this.getClass().getSimpleName());
        super.info();
        System.out.println("size : " + size);
        System.out.println("-----------------------------");
    }
}
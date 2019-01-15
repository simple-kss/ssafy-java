package com.computer;

public class MainFrame extends Parts
{
//    String maker;
    private String cpu;

    public MainFrame(String maker, int price, String cpu, int num)
    {
        super(maker, price, num);
        this.cpu = cpu;
    }
    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void powerOn()
    {
        System.out.println("MainFrame_Power_On");
    }
    void powerOff()
    {
        System.out.println("MainFrame_Power_Off");
    }
    public void info()
    {
        System.out.println(this.getClass().getSimpleName());
        super.info();
        System.out.println("cpu : " + cpu);
        System.out.println("-----------------------------");
    }
}
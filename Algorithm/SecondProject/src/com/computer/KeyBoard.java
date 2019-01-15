package com.computer;

public class KeyBoard extends Parts
{
//    String maker;
    private String type;

    public KeyBoard(String maker, int price, String type, int num) {
        super(maker, price, num);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void keyType()
    {
        System.out.println("KeyBoard_KeyType");
    }
    public void info()
    {
        System.out.println(this.getClass().getSimpleName());
        super.info();
        System.out.println("type : " + type);
        System.out.println("-----------------------------");
    }
}
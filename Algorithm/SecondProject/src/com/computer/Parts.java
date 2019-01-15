package com.computer;

public class Parts
{
    private String maker;
    private int price;
    private int num;
    
    public String getMaker()
    {
        return maker;
    }

    public void setMaker(String maker)
    {
        this.maker = maker;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    
    
    
    public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Parts(String maker, int price, int num)
    {
        this.maker = maker;
        this.price = price;
        this.num = num;
    }

    public void info()
    {
        System.out.println("num : " + num);
        System.out.println("maker : " + maker);
        System.out.println("price : " + price);
    }
}
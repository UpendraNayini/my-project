package com.niit.ShopingCart;

public class TestProduct {
public static void main(String args[])
{
	Product p1=new Product(101,"iphone",20000);
	Product p2=new Product(102,"samsung",2222);
	
p1.setPrice(20000);
p2.setPrice(2222);
	
	
	System.out.println(p1.getId()+p1.getName());
	System.out.println("Name:"+p1.getName());
	System.out.println("price:"+p1.getPrice());
	
	System.out.println("ID:"+p2.getId());
	System.out.println("Name:"+p2.getName());
	System.out.println("price:"+p2.getPrice());
}
}

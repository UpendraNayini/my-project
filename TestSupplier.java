package com.niit.ShopingCart;

import java.util.ArrayList;
import java.util.List;

public class TestSupplier {
	//private static final List<Product> ProductList ;

	public static void main(String args[])
	{
		Product p1=new Product(101,"iphone",70000);
		Product p2=new Product(102,"Tv",50000);
		
		
		Supplier s1=new Supplier("SUP001","Reliance","Bombay");
		List<Product> ProductList=new ArrayList<Product>();
		ProductList.add(p1);
		ProductList.add(p2);
		
		
		
		s1.setProducts(ProductList);
		
		
		System.out.println("The details...");
		
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
	}

		
		
		
	}
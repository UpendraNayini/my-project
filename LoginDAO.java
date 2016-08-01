package com.niit.ShoppingCart;

public class LoginDAO {
	

	public boolean isValidUser (String id,String Password)
	{
		if(id.equals("niit") &&Password.equals("niit"))
			
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
}
	
	



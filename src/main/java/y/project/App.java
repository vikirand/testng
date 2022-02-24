package y.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}   

package com.sdet;
import java.util.ResourceBundle;

public class App
{ 
	public int userLogin(String in_user, String in_pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UserName=rb.getString("username");
		String Password=rb.getString("password");
		if  (in_user.equals(username) && in_pwd.equals(password))
			return 1;
		else 
			return 0;
	}
}


package com.csi.exceptionbasics;

import java.sql.SQLException;

public class ExceptionCore {
public static void main(String[] args) throws SQLException  {
	try
	{

		int res = 10/0;
	} catch (ArithmeticException  | NullPointerException  | ArrayIndexOutOfBoundsException e1){
		// TODO: handle exception
		e1.printStackTrace();
	}
	catch (Exception e)
	{
	e.printStackTrace();
	
	} 
	finally{
		System.out.println("Always Execute");
	}
	ExceptionCore e11 = new ExceptionCore();
	(e11).isAgeValid(17);
}
public void isAgeValid (int age )    throws NullPointerException, ArrayIndexOutOfBoundsException,ArrayIndexOutOfBoundsException{
	if (age<18){
			try {
				throw new AgeInvalidException("Age is not valid");
			} catch (AgeInvalidException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Eligible For Vote");
		
		}
}
}

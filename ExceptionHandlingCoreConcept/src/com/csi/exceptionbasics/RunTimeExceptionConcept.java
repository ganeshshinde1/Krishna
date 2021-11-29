package com.csi.exceptionbasics;

import java.io.File;
import java.io.IOException;

public class RunTimeExceptionConcept {
public static void main(String[] args) {
	 String empName = null;
	 System.out.println(empName.length());//Run Time Exception
	 File f1= new File ("E://cs.png");
		 try {
			if (f1.createNewFile())
			 {
				 
			 }
		} catch (IOException e) {// Compile Time Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}

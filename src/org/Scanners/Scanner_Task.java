 package org.Scanners;

import java.util.Scanner;

public class Scanner_Task {
	public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("STUDENT NAME:");
        String name = a.nextLine();
        System.out.println(name);
        
        System.out.println("STUDENT DETAILS:");
        int id = a.nextInt();
        System.out.println(id);
                
        System.out.println("STUDENT MAIL:");
        String mail = a.next();
        System.out.println(mail);
        
        System.out.println("STUDENT PHONENO");
        long phoneno = a.nextLong();
        System.out.println(phoneno);
        
        System.out.println("STUDENT DEPARTMENT:");
        String dept = a.next();
        System.out.println(dept);
		
        System.out.println("STUDENT GENDER:");
        String gender = a.next();
        System.out.println(gender);
        
        System.out.println("STUDENT CITY:");
		 String city = a.next();
		 System.out.println(city);
		 
		 
	}
	

}

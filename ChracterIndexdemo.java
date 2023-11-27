package test;

import java.util.Scanner;

public class ChracterIndexdemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	System.out.println("enter the position you want");
	int pos=sc.nextInt();
	System.out.println("the charcter at position "+pos+" is :"+str.charAt(pos));
	}

}

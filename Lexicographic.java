package test;

import java.util.Scanner;

public class Lexicographic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.nextLine();
		System.out.println("enter the second string");
		String str2=sc.nextLine();
		int val=str1.compareToIgnoreCase(str2);
		if(val==0)
			System.out.println("str1 == str2");
		else if(val>0)
			System.out.println("str2 < str1");
		else
			System.out.println("str1 < str2");
	}

}

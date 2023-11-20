package udemy_jv;

import java.util.Scanner;

public class LeapYear_check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter the year");
		year=sc.nextInt();
		if(year%4==0) {
			if(year %100==0) {
				if(year%400==0) {
					System.out.println("leap year");
				}else {
					System.out.println("not a leap year");
				}
			}
			else {
				System.out.println("leap year");
			}
			
		}else {
			System.out.println("not a leap year");
		}

	}

}

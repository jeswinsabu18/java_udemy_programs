package udemy_jv;

import java.util.Scanner;

public class Cuboid_udemy {
	public static void main(String[] args) {
		int base,height,breadth,area,volume;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the base ,height,breadth");
		base=sc.nextInt();
		height=sc.nextInt();
		breadth=sc.nextInt();
		area=2*(base*height+height*breadth+base*breadth);
		volume=base*height*breadth;
		System.out.println("Area="+area);
		System.out.println("voume="+volume);
	}

}

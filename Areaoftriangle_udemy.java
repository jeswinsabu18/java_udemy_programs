package udemy_jv;
import java.util.Scanner;

public class Areaoftriangle_udemy {
	public static void main(String[] args ) {
		int height,base;
		float area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base and height");
		base=sc.nextInt();
		height=sc.nextInt();
		area=(float)(height*base*0.5f);
		System.out.println("Area="+area);
	}

}

package udemy_jv;
import java.util.*;
public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		sc.useRadix(2);
		System.out.println("enter a binary value to converted");
		int x=sc.nextInt();
		System.out.println("decimal value="+x);
	}

}

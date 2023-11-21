package udemy_jv;
import java.util.*;
public class Website_udemy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the url");
		String url=sc.nextLine();
		String protocol = url.substring(0,url.indexOf(":"));
		if(protocol.equals("http"))
		{
			System.out.println("hyper text transfer protocol");
		}
		else if(protocol.equals("ftp")) 
			System.out.println("file transfer protocol");
		String ext=url.substring(0,url.lastIndexOf("."));
		if(ext.equals("com")) {
			System.out.println("commercial");
		}
			else if(ext.equals("org"))
				System.out.println("organisation");
				
	
		

	}

}

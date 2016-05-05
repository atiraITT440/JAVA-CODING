import java.io.*;
import java.net.*;

class Inet{
	public static void main(String a[]){
		try{
			InetAddress ip = InetAddress.getByName("www.google.com");

			System.out.println("Host Name : "+ ip.getHostName());
			System.out.println("IP Address : "+ ip.getHostAddress());

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
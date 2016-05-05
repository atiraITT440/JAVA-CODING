import java.io.*;
import java.net.*;
import java.lang.*;

class InetAddress{
	public static void main(String a[])throws unknownHostException {
		
			InetAddress Address = InetAddress.getLocalHost();
			System.out.println(Address);

			Address = InetAddress.getByName("www.google.com");
			System.out.println(Address);

			InetAddress sw[] = InetAddress.getAllByName("www.yahoo.com");

			for(int i = 0; i < sw.length; i++){
				System.out.println(sw[i]);
			}

	}
}
package day02;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saati Yaziniz : ");
		
		long saat = scan.nextLong();
		System.out.println("Saniye = " + saat*60*60);

	}

}

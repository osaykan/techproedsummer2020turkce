package day02;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mil Uzunlugunu Giriniz : ");
		
		
		long uzunluk = scan.nextLong();
		
		System.out.println("Kilometre = " + 1.6*uzunluk);
		
		
		

	}

}

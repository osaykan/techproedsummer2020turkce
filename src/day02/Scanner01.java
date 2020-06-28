package day02;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki Sayi Giriniz...");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Summe : " + (sayi1+sayi2));
		System.out.println("Multipikation : " + sayi1*sayi2);
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Trage Seiten des Quaders ein..");

		double seite1 = scan.nextDouble();
		double seite2 = scan.nextDouble();
		double seite3 = scan.nextDouble();
		System.out.println("Volume des Queders : " + seite1*seite2*seite3 );
		
		
		
	}

}

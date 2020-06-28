package day04;

import java.util.Scanner;

public class Ders2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	System.out.println("Iki tane tam sayi giriniz..");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println("Girilen sayilar ");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		sayi1= sayi1+sayi2;
		sayi2 = sayi1-sayi2;
		sayi1 = sayi1-sayi2;
		
	
		System.out.println("Degistikten sonra..");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		
		

	}

}

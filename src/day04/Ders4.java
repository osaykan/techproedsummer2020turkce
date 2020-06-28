package day04;

import java.util.Scanner;

public class Ders4 {

	public static void main(String[] args) {
		//Iki sayinin yerlerini degistiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iki adet tam sayi Giriniz..");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		System.out.println("Girdiginiz ilk sayi : " + sayi1 );
		System.out.println("Girdiginiz ikinci sayi : " + sayi2 );
		
		int geciciSayi = 0;
		geciciSayi = sayi1;
		sayi1 =sayi2;
		sayi2=geciciSayi;
		
		System.out.println("Degisiklikten Sonra");
       System.out.println(sayi1);
       System.out.println(sayi2);

	}

}

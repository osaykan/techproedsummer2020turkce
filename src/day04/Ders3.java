package day04;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi Giriniz..");
		String ad = scan.nextLine();
		
		System.out.println("Soy Adinizi Giriniz..");
		String soyAd = scan.nextLine();
		
		System.out.println("Adiniz ve Soy Adiniz : " + ad + "  " + soyAd );
		
	/*	ad    =   ad + soyAd;
		soyAd = ad + soyAd;
		//ad    = ad -soyAd;         cikarma islemi Stringte olmuyor
	    System.out.println(ad);
		System.out.println(soyAd);
	*/	
		
		
	}

}

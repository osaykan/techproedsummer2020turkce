package day04;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi ve Soyadinizi Giriniz..");
		
		String ad = scan.nextLine();
		String soyAd = scan.nextLine();
         System.out.print("Adiniz : " + ad);
         System.out.println(" /  Soyadiniz : " + soyAd);
         
         String gecici ;
         gecici =ad;
         ad = soyAd;
         soyAd = gecici;
         System.out.println("Degisimden Sonra..");
         System.out.print("Adiniz  : " + ad);
         System.out.println(" /  Soyadiniz  : " + soyAd);
       
         
         
         
	}

}

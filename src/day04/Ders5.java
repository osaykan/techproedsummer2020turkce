package day04;

import java.util.Scanner;

public class Ders5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Maasinizi Giriniz..");
		String maas = scan.nextLine();
		int ymaas = Integer.parseInt(maas);
		System.out.println("Maasiniz : " + ymaas + "  Euro");
		
		System.out.println("Adinizi ve Soyadinizi Giriniz..");
		String isim = scan.nextLine();
		System.out.println("Isminiz : " + isim);

	}

}

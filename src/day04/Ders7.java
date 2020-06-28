package day04;

import java.util.Scanner;

public class Ders7 {

	public static void main(String[] args) {
		//Dört basamakli bir sayinin rakamlar toplami
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dört Basamakli Bir Tamsayi Giriniz..");
		
		int x = scan.nextInt();
		
		int sRakam = x % 10;
		int a = x/10;
		int oBasamagi = a % 10;
		int b = x / 100;
		int yBasamagi = b % 10;
		int bBasamagi = x / 1000;
		
System.out.println("Sayinin Rakamlar Toplami : " +(sRakam+oBasamagi+yBasamagi+bBasamagi));
		
		
		
		

	}

}

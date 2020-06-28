package day07;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// // Kullanicidan password girmesini isteyin
		//Password  4 basamakli bir sayi ise cift olup olmadigini kontrol edin.
		//Cift ise Password tamam yazhdirin , Tek sayi ise Tekrar deneyin yazdirin
		//Password 4 basamakli dagilse Tekrar deneyin yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Password'unuzu Giriniz..");
		int password = scan.nextInt();
		
		
		if(password>999 && password<10000) {
			if(password%2==0) {
				System.out.println("Password Tamam..");
				
			}else if(password%2!=0) {
				System.out.println("Tekrar deneyin");
			}
			
		}else {
			System.out.println("Tekrar deneyin.........");
		}
scan.close();
	}

}

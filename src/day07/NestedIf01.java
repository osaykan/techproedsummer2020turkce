package day07;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan  bir sayi alin. Bu sayi pozitif ise 9 dan buyukmu diye kontrol rdin, 9 dan b�y�kse ekrana sayi yazdirin
		// 9 dan k�c�kesit ve sifirdan b�y�k esitse ekrana rakam yazdirin.
        // Bu sayi negatif ise ekrana Sayi yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir sayi giriniz.");
		int num = scan.nextInt();
		
		if(num>=0) {
			if(num>9) {
				System.out.println("Sayi");
			}else if(num>=0 && num<=9) {
				System.out.println("Rakam");
				
			}
			
		}else if(num<0) {
			System.out.println("Sayi.....");
			
		}
		
		
		
		
		
scan.close();
	}

}

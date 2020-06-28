package day07;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan  bir sayi alin. Bu sayi pozitif ise 9 dan buyukmu diye kontrol rdin, 9 dan büyükse ekrana sayi yazdirin
		// 9 dan kücükesit ve sifirdan büyük esitse ekrana rakam yazdirin.
        // Bu sayi negatif ise ekrana Sayi yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz.");
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

package day07;

import java.util.Scanner;

public class ArtikyilInterviev {

	public static void main(String[] args) {
		// Task: Kullanicidan yil girmesini isteyin
				//Girilen yil artik yil ise ekrana "Artik yil " yazdirin
				// Degilse "Artik yil degil yazdirin.
				
				// Artik yil 1) Yil 100 e b�lunurse 400 e de b�lunmeli  ==> 1300 artik yil degildir. 100 e b�lunur ama 400 e b�lunmez
				//                                                     ==> 1200 artik yildir  100 e b�lunur ve 400 e b�lunur
				//           2) Yil 100 e b�lunmezse 4 e b�lunmeli
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yil Giriniz...");
		int yil = scan.nextInt();
		
		if(yil%100==0 && yil%400==0) {
			System.out.println("Artik yil");
			
			}else if(yil%100!=0 && yil%4==0) {
				System.out.println("Artik yil...");
				
			
		}else {
			System.out.println("Artik yil degil");
		}

	}

}

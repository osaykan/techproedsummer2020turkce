package day02;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ücgenin uzunluklarini Giriniz : ");
		
		float uzunluk1 = scan.nextFloat();
		float uzunluk2 = scan.nextFloat();
		float uzunluk3 = scan.nextFloat();
		
		System.out.println("Ücgenin Cevresi= " + (uzunluk1+uzunluk2+uzunluk3));
		
		
		
	}

}

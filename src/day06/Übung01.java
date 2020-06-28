package day06;

import java.util.Scanner;

public class Übung01 {

	public static void main(String[] args) {
		// a nin degeri 97...........	
		// 97+98=195 olur. + varsa sayi gibi düsünüyor.................................
		//ab yazdirmak icin ln kaldirdik...............................................
		// Bir char in sayi degeri ASCII tablosu kullanmadan nasil bulunur.............
		// Data type i int olan bir variable olustur ve char i bu variable a ata.int a = 'b'......
		//%,!,& char degeri...........................................................
		/*
		Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan ..............
		bir program yazınız. (float kullanınız)................................................
		Not 1: pi sayısı: 3.14159..............................................................
		Not 2: Alan: 3.14159 x radius x radius................................................
		Not 3: Cevre: 2 x 3.14159 x radius.................................................... 
		*/
		// int data tipinin max ve min degerlerini bulup ekrana yazalim.....................
		// int in wrapper class ini kullanacagiz Integer yaz sonuna nokta koy ve sec..........
		 //Kücük data tipini buyuk data tipine cevirmek icin ekstra kod yazmaya gerek yok. Java bunu otomatik yapar.(Auto Widening)
		//büyükten kücüge hemen
		// 255 cikmasini bekliyoruz ama 255 sinirlarin disinda.
		
/*		int aChar = 'a';
		System.out.println("a nin degeri = " + aChar);
		
		int prozent = '%';
		System.out.println("% in degeri = " + prozent);
		
		int ünlem = '!';
		System.out.println("Ünlem in degeri = " + ünlem);
		
		char harf2 = 'a';
		char harf1 = 'b';
		System.out.print('a');
		System.out.println('b');
		System.out.println("Toplam :" + ('a'+ 'b'));
*/		
		
/*		Scanner scan = new Scanner(System.in);
		System.out.println("Dairenin Yaricapini Giriniz...");
		float radius = scan.nextFloat();
		double alan = 3.14*Math.pow(radius, radius);
		System.out.println("Dairenin Alani : " + alan);
		System.out.println("Dairenin Cevresi : " + 2*3.14*radius);
*/		
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Boolean.FALSE);
		System.out.println(Byte.MAX_VALUE);
	
		short a = 15;
		int b = a;
		System.out.println(b);
		
		int num =12;
		short num1 =(short) num;
		System.out.println(num1);
		
		long num2 = 260;
		byte num3 =(byte) num2;
		System.out.println(num3);
		
		char num4 = 'x';
		byte num5 =(byte) num4;
		System.out.println(num5);
		
		int num6 = 720;
		char num7 =(char)num6;
		System.out.println(num7);
		
		char soru = ':';
	
		System.out.println("? nin char degeri : " +soru);
		
		
		
		
	}

}

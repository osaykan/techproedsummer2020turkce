package day05;

import java.util.Scanner;

public class �bung1 {

	public static void main(String[] args) {
	
	/*	System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.round(2.73));
		System.out.println("Hedefinize ulasmak icin \"Planli Calisin\".");
		System.out.println("Sifir bir \'Tam\' sayidir");
		System.out.println("Cok 'Hizli' oldu");
		System.out.println("M�chtest du 'tea' oder 'kaffee' ?");
		System.out.println("Willst\\M�chtest du tea ");
		System.out.println("Ein Slash im String \\\" und das Anf�hrungszeichen\"");
		System.out.println(2+"201"+3+4);//220134
		System.out.println(2+"201"+(3+4));//22017
		System.out.println(2+"25"+4*3);//22512
	*/	
		//Decrement
		Scanner sc = new Scanner(System.in);
		int bank = 3000;
		System.out.println("Bankadaki Paraniz : " + bank + " Euro");
		System.out.println("Cekeceginiz Para Miktarini Giriniz..");
		int zahl = sc.nextInt();
		
		bank = bank-zahl;
		System.out.println("Kalan Miktar : " + bank + " Euro");
		
		
		
		
		
		
		
		
		

	}

}

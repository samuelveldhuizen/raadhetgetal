package com.sam;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
			Random rand = new Random();
		Scanner scan= new Scanner(System.in);
		int getal = rand.nextInt(10) + 1;
		int lives = 3;
		int num = 0;
		while(num != getal && lives != 0) {
			num = scan.nextInt();

			if(num == getal) {
				System.out.println("goed geraden getal was " + getal + " aantal levens over " + lives );
			}else {
				lives --;
				if(lives == 0) {
					System.out.println("jammer je hebt het niet geraden het getal was " + getal);
				}else {
					if(num < getal && num != getal) {
						System.out.println("het getal is hoger");
					}else {
						System.out.println("het getal is lager");
					}
				System.out.println("Jammer probeer het nog eens. levens over " + lives);
				}
			}
		}	      
    }
}

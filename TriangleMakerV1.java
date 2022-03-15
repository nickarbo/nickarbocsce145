/*
 * Written by Nick Arboscello
 */

import java.util.Scanner;

public class TriangleMakerV1 {

	public static void main(String[] args) {
	
		int a;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the size of your triangle.");
		a = keyboard.nextInt();
		
		drawTriangle(a);
		System.out.println("Done!");

	}
	public static void drawTriangle(int a) {
		for(int i = 1; i <= a; i = i + 1) {
			printTriangleMakerV1(i);
		}
		for(int i = 1; i < a; i = i +1) {
			printTriangleMakerV1(a-i);
		}
	}
	public static void printTriangleMakerV1(int k) {
		for(int i = 1; i <= k; i = i +1) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

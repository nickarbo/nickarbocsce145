/*
 * Written by Nick Arboscello
 */
import java.util.Scanner;
public class BinaryDigitConverterV1 {

	public static int getDecimal(int binary){
		int decimal = 0;
		int n = 0; while(true) {
			if(binary == 0) {
				break;
			}else {
				int temp = binary % 10;
				decimal += temp*Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-bit binary number");
		String str1= sc.nextLine();
		System.out.println("Enter another 4-bit binary number");
		String str2 = sc.nextLine();
		
		int bin1 =Integer.parseInt(str1);
		int bin2 = Integer.parseInt(str2);
		
		int dec1 = getDecimal(bin1);
		int dec2 = getDecimal(bin2);
		
		System.out.println("The first number is "+ dec1);
		System.out.println("The second number is "+ dec2);
		System.out.println("Added together "+ (dec1+dec2));

	}

}

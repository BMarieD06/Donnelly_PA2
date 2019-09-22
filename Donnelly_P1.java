import java.util.*;

public class Donnelly_P1 {
	
	
	static int encryption(int x){
		
		// Break the 4 digit number into individual digits
		
		int a =  x / 1000;
		int b = (x % 1000) / 100;
		int c = (x % 100) / 10;
		int d =  x % 10;
		
		// Add 7 to each digit and find the remainder when dividing by 10
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		// Swap the first/third digits and the second/fourth digits
		// Return the results
	
		return (c * 1000 + d * 100 + a * 10 + b);
		
	}
	
	static int decryption(int x) {
		
		// Break the 4 digit number into individual digits
		
		int a =  x / 1000;
		int b = (x % 1000) / 100;
		int c = (x % 100) / 10;
		int d =  x % 10;
		
		// This "subtracts 7" from each digit and finds the remainder when dividing by 10
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		
		// Swap the first/third digits and the second/fourth digits
		// Return the results
		
		return (c * 1000 + d * 100 + a * 10 + b);
		
	}

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int n;
		int n2;
		
		System.out.println("Please enter a 4 digit integer: ");
		
		// Continues to take in inputs until a valid integer is entered
		
		do {
			
			n = scnr.nextInt();
		
			if(n<999 || n>10000)
			{
				System.out.println("Please enter a valid 4 digit integer: ");
			}
		
		}while(n<999 || n>9999);
		
		// Encrypt the 4 digit integer
		
		n2 = encryption(n);
		
		
		
		System.out.println("Encrypted number is: " + n2);
		System.out.println("The Decrypted number is: " + decryption(n2));
		
		scnr.close();
	}

}

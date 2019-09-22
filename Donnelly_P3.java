import java.util.*;

public class Donnelly_P3 {
	

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"Success  ", "Education", "Happiness", "Family   ", "Health   "};
		int[][] responses = new int[5][10];
		int[] highLow = new int[5];
		
		int i, j, highest, lowest, tempHigh, tempLow;
		int numPolled = 0;
		int response = 0;
		int total = 0;
		double average;
		boolean notDone = true;
		
		while(notDone == true)
		{
			numPolled += 1;
			
			for(i = 0; i<5; i++) {
				
				System.out.println("On a scale of 1-10 how important is " + topics[i] + ":");
				j = scnr.nextInt();
				
				responses[i][j -1] += 1;
				
			}
			
			System.out.println("Is someone else going to answer the poll? ");
			
			do {
			System.out.println("Enter 1 for yes and 2 for no");
			
			response = scnr.nextInt();
			
			}while(response != 1 && response != 2);
				
			if(response == 2) {
				notDone = false;
			}
				
		}
		
		i = 0;
		j = 0;
		
		System.out.println("\t        1   2   3   4   5   6   7   8   9   10");
		
		for(i = 0; i<5; i++){
			
			System.out.print(topics[i] + "\t");
			for(j = 0; j<10; j++){
			
				System.out.print(responses[i][j] + "   ");
				
				// calculates and totals the number of times a user chose a certain response
				total += responses[i][j] * (j+1);
			}
			highLow[i] = total;
			average = (double)total/(double)numPolled;
			System.out.print(average);
			System.out.print("\n");
			total = 0;
		}
		
		highest = highLow[0];
		lowest = highLow[0];
		tempHigh = 0;
		tempLow = 0;
		
		for(i = 1; i<5; i++) {
			if(highLow[i] > highest) {
				highest = highLow[i];
				tempHigh = i;
			}
			
			if(highLow[i] < lowest) {
				
				lowest = highLow[i];
				tempLow = i;
			}	
		}
		
		System.out.println("\nHighest rated topic is " + topics[tempHigh] + ". It received " + highest + " points.");
		System.out.println("Lowest rated topic is " + topics[tempLow] + ". It received " + lowest + " points.");
	
		scnr.close();
	}

}

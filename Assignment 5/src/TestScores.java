import java.util.*;

public class TestScores {

	public static void main(String[] args) {
		
		int arryLength = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program will calculate average scores \nPlease enter the number of scores you will input");
		arryLength = scan.nextInt();
		int[] array = new int[arryLength];
		
		int x = 1;
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter score number " + x);
			array[i] = scan.nextInt();
			x++;
		}
		
		
		Scores score = new Scores(array);
		
		System.out.println("The average score is " + score.getAverage());

	}

}

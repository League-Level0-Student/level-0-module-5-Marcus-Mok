package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog(null, "What number do you want to see if its prime");
	int score = 0;
	int number = Integer.parseInt(input);
	for(int i = 1; i<10000000; i++) {
		if(number % i == 0) {
			score=score+1;
		}
		}
			if(score == 2) {
				System.out.println("it is prime");
			}
			else {
				System.out.println("its is not prime");
			}
		
	
	
	
	
	
	
	
}
}

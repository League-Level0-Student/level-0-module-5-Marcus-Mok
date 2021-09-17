package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	
	int number1 = 1;
	int number2 = 0;
	int sum = 0;

	
	for(int i = 0;i<20; i++) {
	sum=number1+number2;
	number2=number1;
	number1=sum;
	System.out.println(sum);
	
	}








}
}

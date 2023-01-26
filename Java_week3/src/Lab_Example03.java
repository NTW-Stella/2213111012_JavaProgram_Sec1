import java.util.*;
public class Lab_Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] number = new int [5];
		for(int i =0; i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		
		/*int sumOfnumber = sumofPos(number);
		System.out.println("Summation of positive number is "+sumOfnumber);*/
		System.out.println("Summation of positive number is "+sumofPos(number));
	}
	public static int sumofPos (int[] nums) {
		int sum = 0;
		for(int _num : nums) {
			sum += _num;
		}
		return sum;
	}

}

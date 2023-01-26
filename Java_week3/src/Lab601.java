import java.util.*;
public class Lab601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		int countOdd = 0;
		for(int i =0; i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
			
			if(number[i]%2 != 0) {
				countOdd++;
			}
		}//End for
		System.out.println("There are "+countOdd+" of odd number.");
		for(int _number : number) {
			if(_number%2!=0) {
				System.out.print(" "+_number);
			}
		}
		
	}

}

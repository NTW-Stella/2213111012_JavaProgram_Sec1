
public class Lab_Example601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {12,50,93,45,75,52,80};
		/*for (int i = 0 ; i<nums.length;i++) {
			System.out.println("nums["+(i+1)+ "] = "+nums[i]);*/
			int i=1;
			for(int _nums:nums) {
				System.out.println("nums[" + i +"] = "+ _nums);
				i++;
		}
	}

}

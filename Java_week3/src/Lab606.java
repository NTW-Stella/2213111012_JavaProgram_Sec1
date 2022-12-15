import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] validValues = { 25,78,41,22,36,85,37 };
		int indexofArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array : "));
		
		while (checkIndex(validValues,indexofArray)) {
			indexofArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array, again : "));
		}
		
		int currentnum = currentData(validValues,indexofArray);
		int previous = prevData(validValues,indexofArray);
		int next = nextdata(validValues,indexofArray);
		
		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + indexofArray + "] is " + currentnum +
				((previous==0) ? "\nNo previous data" : "\nPrevious data, nums [" 
				+ (indexofArray-1) + "] is " + previous) +
				((next==0) ? "\nNo next data" : "\nNext data, nums [" 
				+ (indexofArray+1) + "] is " + next)
				);
	}
	
	public static boolean checkIndex(int[]nums,int index) {
		return index < 0 || (index > (nums.length)-1);
	}
	
	public static int currentData(int[]nums,int index) {
		int found = 0;
		found = nums[index];
		return found;
	}
	
	public static int prevData(int[]nums,int index) {
		if (index-1 < 0) {
			return 0;
		}else {
	    	return nums[index-1];
		}
	}
	
    public static int nextdata(int[]nums,int index) {
    	if (index+1 > (nums.length-1)) {
			return 0;
		}else {
    	return nums[index+1];
		}
	}

}

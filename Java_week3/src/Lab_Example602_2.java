import javax.swing.*;
public class Lab_Example602_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		boolean deptFound = false;
		String dept = JOptionPane.showInputDialog("Enter a department name ");
		
		for(int i = 0 ; i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptFound = true;
			}
		}
		JOptionPane.showMessageDialog(null, (deptFound)
				? dept + "was found in the lise"
				: dept +"was not found in the list");
		
	}

}

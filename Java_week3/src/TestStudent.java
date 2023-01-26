import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student anupap = new Student("AnuPap Jaising","1 Happy Ave");
		System.out.println(anupap);
		
		//Test Setters and Gettesr
		anupap.setAddress("25 Pattanakarn");
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());
		
		anupap.addCourseGrade("INT107",87);
		anupap.addCourseGrade("IN87T108",81);
		anupap.addCourseGrade("MNSC-202",92);
		anupap.printGrades();
		
		System.out.printf("\nThe average grade is %. %2f%n",anupap.getAverageGrade());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

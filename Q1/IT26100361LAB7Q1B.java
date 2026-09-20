import java.util.Scanner;

public class IT26100361LAB7Q1B {
    public static void main(String[] args) {
        
		int mark1, mark2, mark3, mark4;
		double average;
        String grade;
		
		int studentCount=1;
		Scanner input = new Scanner(System.in);
		
		while (studentCount<=3)
		{
			System.out.println ("Student " + studentCount);
			System.out.print("Enter marks: ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			average = (mark1 + mark2 + mark3 + mark4) / 4.0;
			System.out.println ("Average " + average);
			
			if (average >= 75) {
				grade = "Distinction";
			}
			else if (average >= 50 && average <= 74) 
			{
            grade = "Credit";
			}
			else {
				grade = "Fali";
			}
			System.out.println("Overall Grade is : " + grade);
			System.out.println();
			
			studentCount++;
		}
	}
}

        
       
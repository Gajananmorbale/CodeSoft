import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables for each subject marks (replace "subject1", etc. with actual names)
        float mathMarks, physicsMarks, chemistryMarks;
        float resultSum;
        float average;
        // Get marks for each subject
        System.out.println("Enter marks for Math (out of 100): ");
        mathMarks = scanner.nextInt();

        System.out.println("Enter marks for Physics (out of 100): ");
        physicsMarks = scanner.nextInt();

        System.out.println("Enter marks for Chemistry (out of 100): ");
        chemistryMarks = scanner.nextInt();

        // Print the obtained marks
        System.out.println("\nObtained marks:");
        System.out.println("Math: " + mathMarks);
        System.out.println("Physics: " + physicsMarks);
        System.out.println("Chemistry: " + chemistryMarks);

       

        // Further processing (calculate total, average, etc.) can be done here

        resultSum=mathMarks+physicsMarks+chemistryMarks;
        System.out.println("Sum of obtained mark:-"+resultSum);

        System.out.println("---------------------------------");

        average=resultSum/3;
        System.out.println("Average of Mark:-"+average);
        
        System.out.println("---------------------------------");

        if(average<35){
        	System.out.println("You are fail");
        }
        if (average>35 && average<60){
        	System.out.println("Congratulation You Are Passed:-You Achive grade(C)");
        }
        if (average>60 && average<80) {
        	System.out.println("Congratulation You Are Passed:-You Achive grade(b)");
        }
        if(average>80){
        	System.out.println("Congratulation You Are Passed:-You Achive grade(A)");	
        }

        scanner.close();
    }
}


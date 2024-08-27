import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter grades for three subjects
        System.out.print("Enter the grade for Subject 1: ");
        int grade1 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 2: ");
        int grade2 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 3: ");
        int grade3 = scanner.nextInt();

        // Initialize the number of failed subjects
        int failedSubjects = 0;

        // Check if each subject is a pass or fail
        if (grade1 <= 40) {
            failedSubjects++;
        }
        if (grade2 <= 40) {
            failedSubjects++;
        }
        if (grade3 <= 40) {
            failedSubjects++;
        }

        // Determine the result based on the number of failed subjects
        if (failedSubjects > 0) {
            System.out.println("The student has failed in " + failedSubjects + " subject(s).");
        } else {
            System.out.println("The student has passed in all subjects.");
        }

        // Close the scanner
        scanner.close();
    }
}
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        // Calculate total and percentage
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        // Determine grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

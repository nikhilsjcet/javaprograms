package basic;

import java.util.Scanner;

public class grade {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        System.out.println("Enter Your Mark");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
            return; 
        }

        System.out.println("Your Grade is " + grade);
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Devflovv
 */
public class JavaApplication3 {

    static String calculateGrade(double percentage) {
        if (percentage >= 85) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 50) return "C";
        else return "F";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try ( // TODO code application logic here
            Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100.0;
        String grade = calculateGrade(percentage);

        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------");
    }
    }
}

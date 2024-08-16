package lab2;

import java.util.Locale;
import java.util.Scanner;

public class FormattedString {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your ID : ");
        int id = input.nextInt();
        System.out.println("Enter Your Name");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();
        System.out.println("Enter Your Salary : ");
        double sal = input.nextDouble();
        System.out.println("======================");
        System.out.printf("Hello %s \nID : %d \nAge : %d \nSalary : %.2f",name,id,age,sal);
    }
}

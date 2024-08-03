package lab2;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of the Day : ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Error ..!");
        }
    }
}

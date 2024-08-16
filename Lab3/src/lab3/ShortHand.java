package lab3;

import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers : ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int rs = ((x>y)?x:y)>z?((x>y)?x:y):z;
        System.out.println("The Largest Number : "+rs);
    }
}

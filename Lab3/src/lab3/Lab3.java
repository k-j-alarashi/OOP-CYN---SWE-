package lab3;

import java.awt.Rectangle;

public class Lab3 {
    public static void main(String[] args) {
        // Rectangle Class that is created by java (JDK)
        Rectangle box = new Rectangle(5, 10, 20, 30);
        // Accessor Methods
        System.out.println("Height : "+box.getHeight());
        System.out.println("Width : "+box.getWidth());
        System.out.println("=======================");
        //Mutator Method
        box.setBounds(100, 200, 300, 400);
        // Accessor Methods
        System.out.println("Height : "+box.getHeight());
        System.out.println("Width : "+box.getWidth());
    }
    
}

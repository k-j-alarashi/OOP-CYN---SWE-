package lab8;

import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChoiceQuestion chq = new ChoiceQuestion();
        chq.setText("Which Programming Language is the Best ? ");
        chq.addChoice("cpp", false);
        chq.addChoice("java", true);
        chq.addChoice("c#", false);
        chq.addChoice("python", false);
        chq.display();
        String a = input.next().toLowerCase();
        System.out.println("========================================");
        System.out.println("Your Answer is : "+chq.checkAnswer(a));
        System.out.println("========================================");        
    }
    
}

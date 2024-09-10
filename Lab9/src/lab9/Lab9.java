package lab9;

import java.util.ArrayList;

public class Lab9 {

    public static void main(String[] args) {
        // Aggregation relationship.
//        Author a = new Author(324, "Khaled", 23);
//        Book b = new Book(1, "java", a);

        // Composition relationship
//        Book b = new Book(1, "java", 324, "Khaled", 23);
        Student s1 = new Student(1, "Ahmed", 21, "CYN");
        Student s2 = new Student(2, "Mohammed", 22, "SWE");
        Student s3 = new Student(3, "Ayman", 23, "AI");

        Teacher t1 = new Teacher(1, "Khaled", 23, 32903);
        Teacher t2 = new Teacher(2, "Ahmed", 25, 32903);
        Teacher t3 = new Teacher(3, "Ali", 28, 32903);

        // Polymorphism
        ArrayList<Person> a = new ArrayList<>();
        System.out.println("Size = " + a.size());
        System.out.println("======================");
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(t1);
        a.add(t2);
        a.add(t3);
        for (Person p : a) {
            System.out.println(p);
            System.out.println("======================");
        }
        System.out.println("Size = " + a.size());

    }

}

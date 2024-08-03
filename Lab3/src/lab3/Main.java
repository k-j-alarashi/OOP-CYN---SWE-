package lab3;

public class Main {
    public static void main(String[] args) {
        // Rectangle Class that is created by us ...
        Rectangle r = new Rectangle(20, 30, 100, 300);
        System.out.println("Height : "+r.getHeight());
        System.out.println("Width : "+r.getWidth());
        System.out.println("=======================");
        //Mutator Methods
        r.setWidth(200);
        r.setHeight(500);
        // Accessor Methods
        System.out.println("Height : "+r.getHeight());
        System.out.println("Width : "+r.getWidth());
    }
}

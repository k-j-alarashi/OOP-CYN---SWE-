package lab3;

public class MuliplicationTables {
    public static void main(String[] args) {
        for (int i = 1; i <=12; i++) {
            for (int j = 1; j <=12; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("=====================");
        }
    }
}

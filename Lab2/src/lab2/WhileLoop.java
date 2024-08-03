package lab2;

public class WhileLoop {
    public static void main(String[] args) {
        float currentM = 10000.0f;
        float futureM = currentM * 2;
        int years = 0 ;
        while(currentM <= futureM){
            currentM = currentM + (currentM*0.05f);
            years++;
        }
        System.out.println("Years : "+years);
    }
}

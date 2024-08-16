package lab5;

public class Lab5 {

    public static void main(String[] args) {
//       Counter c = new Counter();
//       System.out.println("coount = "+c.getCount()); // count = 0
//       c.incremnt(); // count = 1
//       System.out.println("coount = "+c.getCount()); // count = 1
//       c.incremnt(); // count = 2
//       System.out.println("coount = "+c.getCount()); // count = 2
//       c.incremnt(); // count = 3 
//       System.out.println("coount = "+c.getCount()); // count = 3
//       c.reset(); //    count = 0 
//       System.out.println("coount = "+c.getCount()); // count = 0
        BankAccount b = new BankAccount(20123, "Khaled", 3000);
        System.out.println("Amount : "+b.getAmount());
        b.depodite(10000);
        System.out.println("Amount : "+b.getAmount());
        b.withDraw(20000);
    }

}

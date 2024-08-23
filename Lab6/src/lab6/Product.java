package lab6;

public class Product {
    private int id;
    private String name ;
    private double price ;
    private int qty;

    public Product() {
        this(1,null);
    }

    public Product(int id, String name) {
        this(id,name,0.0,0);
    }

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public void discount(int precentage){
        this.price = this.price - (this.price * precentage/100);
    }
    
    public void displayDetails(){
        System.out.println("ID          : "+getId());
        System.out.println("Name        : "+getName());
        System.out.println("Price       : "+getPrice());
        System.out.println("Qty.        : "+getQty());
        System.out.println("======================");
    }
}

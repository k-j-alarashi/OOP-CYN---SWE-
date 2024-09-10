package lab9;

public class Book {
    private int id ;
    private String title ;
    private Author a ;

    // When the relatioship is aggregation ( weak has-a )
    public Book(int id, String title, Author a) {
        this.id = id;
        this.title = title;
        this.a = a;
    }
    
    // When the relatioship is composition ( strong has-a )
    public Book(int id, String title , int aid , String name , int age) {
        this.id = id;
        this.title = title;
        a = new Author(aid, name, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getA() {
        return a;
    }

    public void setA(Author a) {
        this.a = a;
    }
    
}

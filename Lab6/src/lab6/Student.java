package lab6;

public class Student {
    private int id ;
    private String name ;
    private int age ;
    private String major ;

    public Student() {
        this(1,null);
    }

    public Student(int id, String name) {
        this(id,name,1,null);
    }

    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void displayDetails(){
        System.out.println("ID          : "+getId());
        System.out.println("Name        : "+getName());
        System.out.println("Age         : "+getAge());
        System.out.println("Major       : "+getMajor());
        System.out.println("=======================");
    }
}

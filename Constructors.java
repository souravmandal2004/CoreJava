class Human {
    private int age;
    private String name;

    public Human () {
        System.out.println ("Object created");
    }
    // public Human () {           // Default Constructor
           // super ();            // Every constructor has the super() method in it
    //     System.out.println (name + ": " + age);
    // }

    public Human (int age, String name) {       // Parameterized Constructor

        super();
        this.age = age;
        this.name = name;
    }

}

public class Constructors {
    public static void main (String[] args) {

        new Human();       // Anonymous object

        Human human = new Human (69, "Mandal"); 
    }
}
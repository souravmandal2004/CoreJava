class Mobile {
    String brand;
    int price;
    static String name;

    public void show () {
        System.out.println (brand + ": " + price + ": " + name);
    }
}


public class StaticVariable {
    public static void main (String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        // m1.name = "SmartPhone";
        Mobile.name = "SmartPhone"; // Because the variable "name" is a static variable


        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1400;
        // m2.name = "SmartPhone";
        Mobile.name = "SmartPhone"; // Because the variable "name" is a static variable


        Mobile.name = "Phone";

        m1.show ();
        m2.show ();
    }
}

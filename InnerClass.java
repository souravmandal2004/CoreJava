class A {
    int num = 69;

    public void show () {
        System.out.println ("in A show");
    }

    class B {
        public void config () {
            System.out.println ("in B config");
        }
    }
}


public class InnerClass {
    public static void main (String[] args) {

        // Now the question is how to access the InnerClass which is B
        // Here is the syntax

        // First you have to create the object of class A 
        A obj = new A ();

        A.B newObj = obj.new B ();
        newObj.config();
    }   
}

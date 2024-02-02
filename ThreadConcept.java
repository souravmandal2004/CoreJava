// Things to remember:
//      1. Every Thread class must have a run method


class A extends Thread {
    public void run () {
        for (int i=0; i<1000; i++) 
            System.out.println ("Hii");
    }
}


class B extends Thread {
    public void run () {
        for (int i=0; i<1000; i++) 
            System.out.println ("Hello");
    }
}

public class ThreadConcept {
    public static void main (String[] args) {

        A obj = new A();
        B newObj = new B();


        obj.start ();
        newObj.start ();
    }
}
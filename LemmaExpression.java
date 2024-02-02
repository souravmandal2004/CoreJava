
@FunctionalInterface
interface A 
{
    void show ();
}

public class LemmaExpression {
    public static void main (String[] args) {
        
        // A obj = new A() {
        //     public void show () {
        //         System.out.println ("Showing...");
        //     }
        // }


        // Short-hand notation or Lemma Expression
        A obj = () ->  System.out.println ("Showing...");


        obj.show ();

    }
}
public class WrapperClass {
    public static void main (String[] args) {

        int num = 69;       // Primitive type

        Integer num1 = num;     // Auto-Boxing

        int num2 = num1;        // Auto-unBoxing

        System.out.println ("The value of num2 is: " + num2);

    }    
}
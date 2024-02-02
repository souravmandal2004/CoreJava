public class ExceptionsHandling {
    public static void main (String[] args) {

        int num1 = 0;
        int num2 = 18;

        try 
        {
            int result = num2 / num1;
            System.out.println (result);
        }
        catch (Exception e) 
        {
            System.out.println ("Something went wrong");
        }

        System.out.println ("Bye");
    }    
}

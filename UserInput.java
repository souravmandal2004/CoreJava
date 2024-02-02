import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main (String[] agrs) throws IOException {

        // System.out.println ("Enter a number: ");

        // Using BufferedReader
        // InputStreamReader in = new InputStreamReader (System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt (bf.readLine());

        // System.out.println ("The number is: " + num);

        // bf.close ();


        // Using Scanner
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter your name: ");
        String name = sc.nextLine ();

        System.out.println ("Hello, " + name);

        sc.close ();


    }
}
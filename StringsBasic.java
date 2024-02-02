public class StringsBasic {
    public static void main (String[] args) {

        // Creation of String
        String str = new String ("Mandal");
        
        System.out.println ("Hello, " + str);


        // StringBuffer
        StringBuffer sb = new StringBuffer();
        System.out.println (sb.capacity()); // The default capacity is 16
        System.out.println (sb.length());   // The default length is 0

        sb.append ("Mandal");
        System.out.println ("Hello, " + sb);
    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionsLearn {
    public static void main (String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer> ();

        // nums.add (6);
        // nums.add (7);
        // nums.add (8);
        // nums.add (9);

        // System.out.println (nums);

        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Mandal", 69);
        students.put("Sourav", 12);
        students.put("Saksham", 90);

        // System.out.println (students);

        // Printing all the values
        for (String key : students.keySet ()) {
            System.out.println (key + ": " + students.get (key));
        }
    }    
}

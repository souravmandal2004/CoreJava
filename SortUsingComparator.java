// In this program, we are going to implement out own Sort method to sort strings based on their length.

import java.util.*;

public class SortUsingComparator {
    public static void main (String[] args) {

        Comparator <String> com = new Comparator<String> () {
            public int compare (String i, String j) {
                if (i.length() > j.length()) 
                    return 1;
                else    
                    return -1;
            }
        };

        List<String> nums = new ArrayList <String> ();
        nums.add ("Saksham Mote");
        nums.add ("Mandal");
        nums.add ("Sourav Mandal");        

        Collections.sort(nums, com);

        System.out.println (nums);

    }
}
public class Array {
    public static void main (String[] args) {

        // Creation of array
        int[] nums = {1, 2, 3, 4, 5};
        int[] numbers= new int[5]; // The array of size 5 and all the values will be 0


        // Accessing all the elements and prints them
        // for (int i=0; i<nums.length; i++) {
        //     System.out.print (nums[i] + " ");
        // }
        // System.out.println ();


        // Multi-dimensional array
        int arr[][] = new int[2][3];


        // Initializing the array with random values
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = (int) (Math.random () * 100);
            }
        }


        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print (arr[i][j] + " ");
            }
            System.out.println ();
        }

        // Using enhanced for loop printing the elements of the array

        System.out.println ("Using enhanced for loop the array is: ");
        for (int n[] : arr) {
            for (int value : n) {
                System.out.print (value + " ");
            }
            System.out.println ();
        }

        // Jagged Array 
        int newNum[][] = new int [2][];
        newNum[0] = new int[3];
        newNum[1] = new int[2];

        for (int i=0; i<newNum.length; i++) {
            for (int j=0; j<newNum[i].length; j++) {
                newNum[i][j] = (int) (Math.random () * 100);
            }
        }
        System.out.println ("Printing the Jagged array: ");
        for (int i=0; i<newNum.length; i++) {
            for (int j=0; j<newNum[i].length; j++) {
                System.out.print (newNum[i][j] + " ");
            }
            System.out.println ();
        }
    }
}
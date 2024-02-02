class Sum {
    public int sumOfTwoNumbers (int num1, int num2)  {
        return num1 + num2;
    }
}


public class ObjectDemo {
    public static void main (String[] args)  {
        Sum sum = new Sum();
        int ans = sum.sumOfTwoNumbers(1, 2);

        System.out.println(ans);

    }
}
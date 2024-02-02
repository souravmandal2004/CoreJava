class Calc {
    public int add (int num1, int num2) {
        return num1 + num2;
    }

    public int sub (int num1, int num2) {
        return num1 - num2;
    }
}

class AdvCalc extends Calc {        // Inheritance 

    public int mul (int num1, int num2) {
        return num1 * num2;
    }

    public int division (int num1, int num2) {
        return num1 / num2;
    }
}


public class Inheritance {
    public static void main (String[] args) {

        AdvCalc calc = new AdvCalc ();

        int sum = calc.add (3, 4);
        System.out.println (sum);

        int subtraction = calc.sub (4, 1);
        System.out.println (subtraction);

    }
}
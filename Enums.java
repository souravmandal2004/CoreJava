// Enums are basically named constants

enum Status {
    Running, Failed, Pending, Success;
}

public class Enums {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s);

        // And if we want all the values then we have one in-built method
        Status[] ss = Status.values();

        for (Status value : ss) {
            System.out.print(value + " ");
        }
        System.out.println ();

        Status newStatus = Status.Pending;

        // Used in if-else
        if (newStatus == Status.Running)
            System.out.println("All Good");
        else if (newStatus == Status.Failed)
            System.out.println("Try Again..");
        else if (newStatus == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

        // Now used in switch
        switch (newStatus) {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait...");
                break;

            case Success:
                System.out.println("Done");
                break;

            default:
                System.out.println("Enter a valid Status!");
        }

    }
}
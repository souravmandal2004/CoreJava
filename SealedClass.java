sealed class A  permits B, C {

}

non-sealed class B extends A {
    // If the class extending a sealed class then it must be of sealed, non-sealed or final
}

final class C extends A {

}

public class SealedClass {
    public static void main (String[] args) {

    }
}

package InitialinlizationCleanup_5.Exercise13;

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);  // (1)
    }
    //static Cups cups1 = new Cups();  // (2)
    //static Cups cups2 = new Cups();  // (2)
}

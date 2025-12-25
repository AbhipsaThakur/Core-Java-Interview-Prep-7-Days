public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        c = a;   // step 1: a ko c me rakho
        a = b;   // step 2: b ko a me rakho
        b = c;   // step 3: c ko b me rakho

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

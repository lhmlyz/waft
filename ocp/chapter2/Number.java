public class Number {
    public static void main (String... args) {
        int a = 5;
        int b = ~a;
        System.out.println(a);
        System.out.println(b);


        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf);   // 3
        System.out.println(coyote); // 3
        
    }
}
package packagea;

import packageb.ClassB;

public class ClassA {
    public static void main (String... args) {
       var a =  new ClassB();
       a.foo();

        System.out.println("Class A");
    }

    public void bar() {
        System.out.println("bar");
    }
}

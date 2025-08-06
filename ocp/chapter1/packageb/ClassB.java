package packageb;

import packagea.ClassA;

public class ClassB {
    public static void main (String... args) {
        System.out.println("Class B");
        var a =  new ClassA();
        a.bar();
    }

    public void foo() {
        System.out.println("foo");
    }
}
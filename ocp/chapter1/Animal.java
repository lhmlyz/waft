
// single line comment

/*
multiline comment

*/

/**
 * JavaDoc Comment
 */
public class Animal {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String... args) {
        var animal = new Animal();
        animal.setName("animal 1");
        System.out.println(animal.getName());
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

class Animal2 {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String... args) {
        var animal = new Animal2();
        animal.setName("animal 2");
        System.out.println(animal.getName());
    }
}
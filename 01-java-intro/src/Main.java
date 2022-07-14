import hello.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "John", "Doe", 35);
        Person p2 = new Person(2L, "Jane", "Doe", 35);
        Person p3 = new Person(2L, "Jane", "Doe", 30);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2);
        System.out.printf("Are p1 and p2 equal ? -> %b%n", p3 == p2);
    }
}

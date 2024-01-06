public class Person {
    private String fullName;
    private int age;

    // Constructors
    public Person() {
        this.fullName = "Undefined";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Method to move
    public void move() {
        System.out.println(fullName + " is moving");
    }

    // Method to talk
    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Saya", 19);
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}

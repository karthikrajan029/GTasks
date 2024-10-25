public class Person {

    int age = 18;
    String name;

    public Person() {
        System.out.println("Default value of age is " + age);
    }

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Person initialized with age " + age +" and"+" name " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person(19, "Karthik");
        p1.display();
    }
}

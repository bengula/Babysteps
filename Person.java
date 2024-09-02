public class Person {
    // Attributes
    String name;  // Attribute to store the name of the person
    int age;      // Attribute to store the age of the person

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to introduce the person
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    // Method to celebrate the birthday and increment age
    public void celebrateBirthday() {
        age++;  // Increment the age attribute by 1
        System.out.println("Happy Birthday! You are now " + age + " years old.");
    }
}


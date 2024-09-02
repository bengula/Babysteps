public class Example {

    // Method with int return type
    public int add(int a, int b) {
        return a + b;
    }

    // Method with String return type
    public String getName() {
        return "Eunice";
    }

    // Method with boolean return type
    public boolean isPositive(int number) {
        return number > 0;
    }

    // Method with void return type
    public void display() {
        System.out.println("This method returns no value.");
    }

    public static void main(String[] args) {
        Example example = new Example();
        int sum = example.add(5, 10);
        System.out.println("Sum: " + sum);

        String name = example.getName();
        System.out.println("Name: " + name);

        boolean positive = example.isPositive(sum);
        System.out.println("Is Positive: " + positive);

        example.display();
    }
}

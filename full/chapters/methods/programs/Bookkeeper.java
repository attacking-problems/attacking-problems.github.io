public class Bookkeeper {
    public static int counter = 0;

    public static void main(String[] args) {
        while (Math.random() > 0.001) {
            increment();
        }

        System.out.println("Increment was called " + counter + " times.");
    }

    public static void increment() {   
        ++counter;  
    }
}
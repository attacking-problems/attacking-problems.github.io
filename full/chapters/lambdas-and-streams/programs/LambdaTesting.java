public class LambdaTesting {    
    public static void main(String[] args) {
        Operator add1 = (int a, int b) -> a + b;
        System.out.println(add1.evaluate(5, -3));

        Operator add2 = (a, b) -> a + b;
        System.out.println(add2.evaluate(5, -3));
    }
    
}

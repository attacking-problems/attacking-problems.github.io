public class ArithmeticProgram {
    public static void main(String[] args) {
        Expression expression1 = new Calculation(Calculation::add, new Number(3), new Number(5));
        System.out.println(expression1.getValue());

        Expression expression2 = new Calculation(Calculation::multiply, new Number(2), expression1);
        System.out.println(expression2.getValue());
    }    
}

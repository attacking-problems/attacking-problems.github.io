import java.util.*;

public class NestedExpressions {

    public static char toLeft(char symbol) {
        return switch (symbol) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> symbol;
        };
    }
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); // <.>
        SymbolStack stack = new SymbolStack(input.length()); // <.>
        char symbol;    
        boolean correct = true; // <.>
        for (int i = 0; i < input.length() && correct; ++i) { // <.>
            symbol = input.charAt(i);
            switch (symbol) {
                case '(', '[', '{' -> stack.push(symbol); // <.>
                case ')', ']', '}' -> {
                    if (stack.isEmpty() || stack.top() != toLeft(symbol)) { // <.>
                        correct = false;
                    } else {
                        stack.pop();
                    }
                }     
            }
        }
            
        if (!stack.isEmpty()) { // Unmatched left symbols <.>
            correct = false;
        }
        
        if (correct) { // <.>
            System.out.println("The input is correctly nested!");
        } else {
            System.out.println("The input is incorrectly nested!");
        }
    }
}
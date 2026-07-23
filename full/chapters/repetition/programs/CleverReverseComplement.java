import java.util.*;

public class CleverReverseComplement {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a DNA sequence: ");
        String sequence = in.next().toUpperCase();              
        String reverseComplement = "";
        for (int i = 0; i < sequence.length(); ++i) {
            switch (sequence.charAt(i)) { // Get complements
                case 'A' -> reverseComplement = "T" + reverseComplement;
                case 'C'-> reverseComplement = "G" + reverseComplement;
                case 'G'-> reverseComplement = "C" + reverseComplement;
                case 'T'-> reverseComplement = "A" + reverseComplement;
            }               
        }
        System.out.println("Reverse complement: " + reverseComplement);
    }
}
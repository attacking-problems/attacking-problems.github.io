import java.util.*;

public class ReverseComplement {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a DNA sequence: ");
        String sequence = in.next().toUpperCase();              
        String complement = "";
        for (int i = 0; i < sequence.length(); ++i) { // <.>
            switch (sequence.charAt(i)) { // Get complements
                case 'A' -> complement += "T";
                case 'C' -> complement += "G";
                case 'G' -> complement += "C";
                case 'T' -> complement += "A";
            }       
        }
        String reverseComplement = "";
        // Reverse the complement
        for (int i = complement.length() - 1; i >= 0; --i) { // <.>
            reverseComplement += complement.charAt(i);
        }
        System.out.println("Reverse complement: " + reverseComplement);
    }
}

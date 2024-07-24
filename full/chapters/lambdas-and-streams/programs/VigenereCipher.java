public class VigenereCipher {
    private final String key;

    public VigenereCipher(String key) {          //<.>
        this.key = key;
    }

    public char encrypt(char input, int index) { //<.>
        return (char)((input - 'A' + key.charAt(index % key.length()) - 'A') % 26 + 'A');
    }

    public char decrypt(char input, int index) { //<.>
        return (char)((input - 'A' - (key.charAt(index % key.length()) - 'A') + 26) % 26 + 'A');
    } 
    
}

public class CaesarCipher {
    private int key;

    public CaesarCipher(int key) {
        this.key = key;
    }

    public char encrypt(char input, int index) {
        return (char)((input - 'A' + key) % 26 + 'A');
    }

    public char decrypt(char input, int index) {
        return (char)((input - 'A' - key + 26) % 26 + 'A');
    }    
}

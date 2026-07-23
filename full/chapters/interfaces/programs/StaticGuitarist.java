public interface StaticGuitarist {
    void strumChord(Chord chord);
    void playMelody(Melody notes);
    
	static String nextNote(String note) {
		char letter = note.charAt(0);
		if (note.length() == 2) {
			if (note.charAt(1) == 'b') {
				return "" + letter;
			} else {
				return switch (letter) {
					case 'B', 'E' ->  (char)(letter + 1) + "#";
					case 'G' ->  "A";
					default ->  "" + (char)(letter + 1);
				};
			}
		} else {
			return switch (letter) {
				case 'B', 'E' -> "" + (char)(letter + 1);
				default -> letter + "#";
			};
		}	
	}
}
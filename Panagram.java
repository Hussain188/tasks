public class Panagram {
    public static void main(String[] args) {
        String inputText = "The quick brown fox jumps over the lazy dog";
        if (isPangram(inputText)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive matching
        boolean[] alphabet = new boolean[26]; // A boolean array to track the presence of each letter

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}

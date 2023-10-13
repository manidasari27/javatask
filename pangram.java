public class PangramChecker {
    public static boolean isPangram(String input) {
        // Create a boolean array to track letter occurrences
        boolean[] letters = new boolean[26];

        // Convert the input to lowercase for case-insensitivity
        input = input.toLowerCase();

        // Iterate through the input and mark the corresponding letters in the array
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }

        // Check if all letters (a to z) are marked as true
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String testInput = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(testInput);
        System.out.println("Is it a pangram? " + result);
    }
}
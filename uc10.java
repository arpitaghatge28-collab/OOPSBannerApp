import java.util.HashMap;

/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function.
 * This version utilizes the Collections Framework (HashMap) to manage 
 * character patterns in a more flexible and efficient manner[cite: 61, 65].
 * * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters[cite: 85].
     * Key: Character, Value: String array representing the ASCII pattern lines[cite: 15, 88].
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        // Initialize the HashMap part of the Java Collections Framework [cite: 13, 39, 91]
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Populate charMap with patterns for 'O', 'P', 'S', and space [cite: 40, 92, 93, 94]
        charMap.put('O', new String[] {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        });

        charMap.put('P', new String[] {
            "****** ",
            "** ** ",
            "** ** ",
            "****** ",
            "** ",
            "** ",
            "** "
        });

        charMap.put('S', new String[] {
            " ***** ",
            "** ",
            "** ",
            " **** ",
            "    ** ",
            "    ** ",
            "***** "
        });

        charMap.put(' ', new String[] {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map[cite: 97].
     * Renders the message horizontally by iterating through pattern rows[cite: 98].
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Retrieve pattern height (assuming uniform height across all patterns) [cite: 104, 105]
        int patternHeight = charMap.get('O').length;

        // Outer loop for each line (row) of the ASCII art [cite: 21, 46, 107]
        for (int line = 0; line < patternHeight; line++) {
            // Use StringBuilder for efficient string concatenation per row 
            StringBuilder sb = new StringBuilder();

            // Inner loop through each character in the message [cite: 21, 48]
            for (char ch : message.toCharArray()) {
                // Efficient lookup using HashMap instead of linear search [cite: 7, 14, 51]
                String[] pattern = charMap.get(Character.toUpperCase(ch));

                // Handle cases where the character might not exist in the map
                if (pattern == null) {
                    pattern = charMap.get(' ');
                }

                // Append the specific line of the character pattern to the row [cite: 52]
                sb.append(pattern[line]).append("  "); 
            }
            // Print the completed horizontal row [cite: 53]
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application[cite: 130].
     */
    public static void main(String[] args) {
        // Initialize the character map [cite: 136, 138]
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Define the message to be displayed [cite: 136]
        String message = "OOPS";

        // Render the banner [cite: 137]
        displayBanner(message, charMap);
    }
}
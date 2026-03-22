/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 * This application retrieves and displays the "OOPS" banner using 
 * encapsulated character-to-pattern mappings.
 */
public class OOPSBannerApp {

    /**
     * Inner class for storing character-to-pattern mappings.
     * Encapsulates a single character and its corresponding ASCII art pattern.
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Initializes CharacterPatternMap array for predefined characters.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // Define pattern for 'O'
        String[] patternO = {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };

        // Define pattern for 'P'
        String[] patternP = {
            "****** ",
            "** ** ",
            "** ** ",
            "****** ",
            "** ",
            "** ",
            "** "
        };

        // Define pattern for 'S'
        String[] patternS = {
            " ***** ",
            "** ",
            "** ",
            "  *** ",
            "    ** ",
            "    ** ",
            "***** "
        };

        // Define pattern for space ' '
        String[] patternSpace = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };

        charMaps[0] = new CharacterPatternMap('O', patternO);
        charMaps[1] = new CharacterPatternMap('P', patternP);
        charMaps[2] = new CharacterPatternMap('S', patternS);
        charMaps[3] = new CharacterPatternMap(' ', patternSpace);

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     * If not found, returns the pattern for a space.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (Character.toUpperCase(ch) == map.getCharacter()) {
                return map.getPattern();
            }
        }
        // Fallback to space if character not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Renders the entire message horizontally line by line.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 7; // Number of lines in each ASCII character

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Adding spacing between letters
            }
            System.out.println(line);
        }
    }

    /**
     * Main method - Entry point for the banner display application.
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}
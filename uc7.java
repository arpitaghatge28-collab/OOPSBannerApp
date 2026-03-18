public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define a String array with banner lines
        String[] lines = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join(" ", " ***  ", " ***  ", " ******" , " ***** ");
        lines[1] = String.join(" ", "**  **", "**  **", "**    **", "**   **");
        lines[2] = String.join(" ", "**  **", "**  **", "**     *", "**   **");
        lines[3] = String.join(" ", "**  **", "**  **", "******  ", " ***** ");
        lines[4] = String.join(" ", "**  **", "**  **", "**      ", "     **");
        lines[5] = String.join(" ", "**  **", "**  **", "**      ", "**   **");
        lines[6] = String.join(" ", " ***  ", " ***  ", "**      ", " ***** ");

        // Print each line using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

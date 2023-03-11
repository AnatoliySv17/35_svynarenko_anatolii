/**
 * print command - line parameters.
 */
public class Main {
      /**
     * This is the main method which takes an array of strings as input and prints
     * each string on a new line.
     *
     * @param args the command line arguments passed to the program
     */
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}

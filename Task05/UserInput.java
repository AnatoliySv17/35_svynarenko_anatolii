import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readDouble(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}

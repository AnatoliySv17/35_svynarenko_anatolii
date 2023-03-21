import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PhysicsAppMenu implements Menu{

    private ArrayList<Command> commands = new ArrayList<>();

    public ArrayList<Command> getCommands(){
        return commands;
    }

    @Override
    public String toString() {
        String s = "Enter command...\n";
        for (Command c : commands) {
            s += ""+c.getKey() +") - "+c+ "\n";
        }
        return s;
    }
    @Override
    public void show() {
        System.out.println("Welcome to Physics Calculator!");
        Integer s;
        Scanner scanner;
        start:
        while (true) {
            System.out.print(this);
            scanner = new Scanner(System.in);
            s = scanner.nextInt();
            for (Command c : commands) {
                if (s.equals(c.getKey())) {
                    c.execute();
                    continue start;
                }
            }
            System.out.println("Invalid option. Please try again.");
        }
    }

}

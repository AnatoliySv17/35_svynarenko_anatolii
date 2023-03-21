public class ExitCommand implements Command{
    @Override
    public Integer getKey() {
        return 3;
    }

    @Override
    public String toString() {
        return "/Exit/";
    }

    @Override
    public void execute() {
        System.out.println("Exiting the program.");
        System.exit(0);
    }
}

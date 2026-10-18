import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        while (true) {
            System.out.print("$ ");
            String command = scanner.nextLine();
            if (command.equals("exit")) return;

            String[] parts = command.split(" ", 2);
            String text = parts[0];
            String argument = parts.length > 1 ? parts[1] : "";


            if (text.contains("echo")) System.out.println(argument);
            else if (text.contains("type")){
                if (argument.equals("echo") || argument.equals("exit") || argument.equals("type")) {
                    System.out.println(argument + " is a shell builtin");
                }
                else System.out.println(argument + ": not found");
            } else System.out.println(text + ": command not found");
        }
    }
}

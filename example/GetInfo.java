package example;
import java.util.Scanner;

class GetInfo {
    public String info() {
        String login;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please provide your login information:");
            login = scanner.nextLine();
        }
        return login;
    }
}

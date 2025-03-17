import java.util.Scanner;

public class InputClass {
    private final Scanner scanner=new Scanner(System.in);

    public String input() {
        return scanner.nextLine();
    }

    public int inputNumber() {
        return scanner.nextInt();
    }

}

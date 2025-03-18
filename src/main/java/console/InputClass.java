package console;

import java.util.Scanner;

public class InputClass {
    private final Scanner scanner=new Scanner(System.in);

    public String input() {
        return scanner.nextLine();
    }

    public int inputNumber() {
        return scanner.nextInt();
    }

    public int parseInt(){
        return Integer.parseInt(scanner.nextLine().replaceAll("[^0-9]", ""));
    }

}

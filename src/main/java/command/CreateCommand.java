package command;

import java.util.Scanner;

public class CreateCommand implements Command{
    private final Scanner scanner;

    public CreateCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(){
        System.out.println("제목: ");
        String title=scanner.nextLine();
        System.out.println("내용: ");
        String content=scanner.nextLine();

    }
}

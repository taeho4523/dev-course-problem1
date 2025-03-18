package command;

import console.InputClass;
import console.OutputClass;
import post.PostManager;

public class CommandProcessor {
    private final InputClass input;
    private final OutputClass output;
    private final PostManager postManager;

    public CommandProcessor(InputClass input, OutputClass output, PostManager postManager) {
        this.input = input;
        this.output = output;
        this.postManager = postManager;
    }

    public void run() {
        while (true) {
            output.print("\n📌 명령어를 입력하세요 (작성/조회/수정/삭제/종료): ");
            String command = input.input();

            switch (command) {
                case "작성":
                    new CreateCommand(input, output, postManager).execute();
                    break;
                case "조회":
                    new ReadCommand(input, output, postManager).execute();
                    break;
                case "수정":
                    new UpdateCommand(input, output, postManager).execute();
                    break;
                case "삭제":
                    new DeleteCommand(input, output, postManager).execute();
                    break;
                case "종료":
                    output.printEnd();
                    return; // 프로그램 종료
                default:
                    output.printNoCommand();
            }
        }
    }
}

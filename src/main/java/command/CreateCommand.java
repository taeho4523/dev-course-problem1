package command;

import console.InputClass;
import console.OutputClass;
import post.PostManager;

public class CreateCommand implements Command {
    private final InputClass input;
    private final OutputClass output;
    private final PostManager postManager;

    public CreateCommand(InputClass input, OutputClass output, PostManager postManager) {
        this.input = input;
        this.output = output;
        this.postManager = postManager;
    }

    @Override
    public void execute() {
        output.print("제목: ");
        String title = input.input();

        output.print("내용: ");
        String content = input.input();

        postManager.addPost(title, content);
        output.print("게시글이 작성되었습니다.");
    }
}

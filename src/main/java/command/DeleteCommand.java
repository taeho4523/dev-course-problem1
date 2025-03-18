package command;

import console.InputClass;
import console.OutputClass;
import post.PostManager;
import java.util.Scanner;

public class DeleteCommand implements Command {

    private final InputClass input;
    private final OutputClass output;
    private final PostManager postManager;

    public DeleteCommand(InputClass input, OutputClass output, PostManager postManager) {
        this.input = input;
        this.output = output;
        this.postManager = postManager;
    }
    @Override
    public void execute(){
        output.print("어떤 게시글을 삭제할까요? ");
        int id = input.parseInt();
        if(postManager.deletePost(id)){
            System.out.printf("%d번 게시물이 성공적으로 삭제되었습니다!",id);
        } else {
            System.out.printf("%d번 게시물은 존재하지 않습니다.",id);
        }
    }
}

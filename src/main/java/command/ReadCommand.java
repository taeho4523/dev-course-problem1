package command;

import console.InputClass;
import console.OutputClass;
import post.Post;
import post.PostManager;

import java.util.Scanner;

public class ReadCommand implements Command{
    private final InputClass input;
    private final OutputClass output;
    private final PostManager postManager;

    public ReadCommand(InputClass input, OutputClass output, PostManager postManager) {
        this.input = input;
        this.output = output;
        this.postManager = postManager;
    }


    @Override
    public void execute(){
        output.print("어떤 게시물을 조회할까요? ");
        int id = input.parseInt();
        Post post = postManager.getPost(id);

        if (post == null) {
            System.out.println(id+"번 게시글은 존재하지 않습니다.");
        } else{
            output.print(post.toString());
        }

    }
}

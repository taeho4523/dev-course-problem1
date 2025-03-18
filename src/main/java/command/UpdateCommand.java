package command;

import console.InputClass;
import console.OutputClass;
import post.Post;
import post.PostManager;

public class UpdateCommand implements Command{

    private final InputClass input;
    private final OutputClass output;
    private final PostManager postManager;

    public UpdateCommand(InputClass input, OutputClass output, PostManager postManager) {
        this.input = input;
        this.output = output;
        this.postManager = postManager;
    }

    @Override
    public void execute(){
        output.print("어떤 게시물을 수정할까요? ");
        int id = input.parseInt();

        Post post = postManager.getPost(id);
        if (post == null) {
            System.out.println(id + "번 게시글은 존재하지 않습니다.");
            return;
        }
        System.out.print("새 제목: ");
        String newTitle = input.input();
        System.out.print("새 내용: ");
        String newContent = input.input();
        postManager.updatePost(id, newTitle, newContent);
        System.out.println(id + "번 게시물이 성공적으로 수정되었습니다!");
    }


}

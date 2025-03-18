import command.CommandProcessor;

import console.InputClass;
import console.OutputClass;
import post.PostManager;

public class Main {
    public static void main(String[] args) {
        InputClass input = new InputClass();
        OutputClass output = new OutputClass();
        PostManager postManager = new PostManager();

        CommandProcessor processor = new CommandProcessor(input, output, postManager);
        processor.run();
    }
}

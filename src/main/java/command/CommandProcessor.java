package command;

import console.InputClass;
import console.OutputClass;

public class CommandProcessor {
    private final InputClass input;
    private final OutputClass output;

    public CommandProcessor(InputClass input, OutputClass output) {
        this.input = input;
        this.output = output;
    }

    public void run(){
        while(true){
            output.printPrompt();
            String command = input.input();
// 케이스마다 별도 함수로 빼서 작성하는게 더 깔끔할듯 하다.
//            switch(command){
//                case "작성":{
//                    System.out.println("제목을 입력하세요: ");
//                    String title=input.input();
//                    System.out.println("내용을 입력하세요: ");
//                    String content=input.input();
//                    //포스트객체에 저장
//                }
//                case "조회":{
//                    System.out.println("어떤 게시물을 조회할까요?");
//                }
//                case "삭제":{
//                    ;
//                }
//                case "수정":{
//
//                }
        }

    }
}
}

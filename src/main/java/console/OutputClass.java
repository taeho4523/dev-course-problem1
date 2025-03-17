package console;

public class OutputClass {

    public void printPrompt() {
        System.out.print("명령어 > ");
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void printEnd(){
        System.out.println("프로그램이 종료됩니다.");
    }

    public void printNoCommand(){
        System.out.println("존재하지 않는 명령어 입니다.");
    }
}

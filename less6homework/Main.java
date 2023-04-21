package less6homework;

public class Main {
    public static void main(String[] args) {
        Controler sum = new Controler(new Sum(), new PrintToConsole(), new ConsoleInput());
        sum.startCalculating();
    }
}

package less7homeworkv3.MVP;

import less7homeworkv3.Input.ConsoleInput;
import less7homeworkv3.Functions.Sum;

public class Presenter {
    public static void startApp(){
        Model sum = new Model(new Sum(), new PrintToConsole(), new ConsoleInput());
        sum.startCalculating();
    }
}
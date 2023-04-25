package less7homeworkv3.MVP;

import less7homeworkv3.*;
import less7homeworkv3.Input.ConsoleInput;
import less7homeworkv3.Objects.ComplNums;
import less7homeworkv3.Objects.RealNums;

import java.util.Scanner;

public class Model<T extends Operations> {
    PrintToConsole view;
    Calculator calculator;
    ConsoleInput input;

    public Model(T typeCalculating, PrintToConsole view, ConsoleInput input) {
        this.view = view;
        this.calculator = typeCalculating;
        this.input = input;
    }

    public void startCalculating() {
        Scanner intputChoise = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            view.printMenu();
            int answer = intputChoise.nextInt();
            switch (answer){
                case 1:
                    calculator.setNumX(new RealNums(input.inputRealPart("a: ")));
                    calculator.setNumY(new RealNums(input.inputRealPart("b: ")));
                    String resultOfSumRealNumbers = calculator.result();
                    view.print(resultOfSumRealNumbers, "Сумма: ");
                    break;
                case 2:
                    calculator.setNumX(new ComplNums(input.inputRealPart("действительная часть первого числа: "),
                            input.inputImaginaryPart("мнимая часть первого числа: ")));
                    calculator.setNumY(new ComplNums(input.inputRealPart("действительная часть второго числа: "),
                            input.inputImaginaryPart("мнимая часть второго числа: ")));
                    String resultOfSumComplexNumbers = calculator.result();
                    view.print(resultOfSumComplexNumbers, "Сумма: ");
                    break;
                case 3:
                    flag = false;
                    break;
            }

        }
    }
}

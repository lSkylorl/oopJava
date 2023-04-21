package less6homework;

import java.util.Scanner;

public class Controler<T extends  Calculating> {
    PrintToConsole fov;
    Calculator calculator;
    ConsoleInput input;

    public Controler(T typeCalculating, PrintToConsole fov, ConsoleInput input) {
        this.fov = fov;
        this.calculator = typeCalculating;
        this.input = input;
    }

    public void startCalculating() {
        Scanner intputChoise = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            fov.printMenu();
            int answer = intputChoise.nextInt();
            switch (answer){
                case 1:
                    calculator.setNumX(new RealNums(input.inputRealPart("a: ")));
                    calculator.setNumY(new RealNums(input.inputRealPart("b: ")));
                    String resultOfSumRealNumbers = calculator.result();
                    fov.print(resultOfSumRealNumbers, "Сумма: ");
                    break;
                case 2:
                    calculator.setNumX(new ComplNums(input.inputRealPart("действительная часть первого числа: "),
                            input.inputImaginaryPart("мнимая часть первого числа: ")));
                    calculator.setNumY(new ComplNums(input.inputRealPart("действительная часть второго числа: "),
                            input.inputImaginaryPart("мнимая часть второго числа: ")));
                    String resultOfSumComplexNumbers = calculator.result();
                    fov.print(resultOfSumComplexNumbers, "Сумма: ");
                    break;
                case 3:
                    flag = false;
                    break;
            }

        }
    }
}

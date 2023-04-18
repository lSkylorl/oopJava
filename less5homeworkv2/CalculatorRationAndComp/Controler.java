package CalculatorRationAndComp;

import java.util.Scanner;

public class Controler<T extends  Calculating> {
    FoV view;
    Calculator calculator;

    public Controler(T typeCalculating, FoV view) {
        this.view = view;
        this.calculator = typeCalculating;
    }

    public void startCalculating() {
        Scanner intputChoise = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            view.printMenu();
            int answer = intputChoise.nextInt();
            switch (answer){
                case 1:
                    calculator.setNumberX(new RealNums(view.inputRealPart("a: ")));
                    calculator.setNumberY(new RealNums(view.inputRealPart("b: ")));
                    String resultOfSumRealNumbers = calculator.result();
                    view.print(resultOfSumRealNumbers, "Сумма: ");
                    break;
                case 2:
                    calculator.setNumberX(new ComplNums(view.inputRealPart("действительная часть первого числа: "),
                            view.inputImaginaryPart("мнимая часть первого числа: ")));
                    calculator.setNumberY(new ComplNums(view.inputRealPart("действительная часть второго числа: "),
                            view.inputImaginaryPart("мнимая часть второго числа: ")));
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

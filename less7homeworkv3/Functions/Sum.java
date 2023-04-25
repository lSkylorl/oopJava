package less7homeworkv3.Functions;

import less7homeworkv3.Input.ConsoleInput;
import less7homeworkv3.MVP.Model;
import less7homeworkv3.MVP.PrintToConsole;
import less7homeworkv3.Objects.Nums;
import less7homeworkv3.Operations;


public class Sum extends Operations {

    public  Sum() {

    }

    @Override
    public String result() {
        if (numX.getImaginaryPart() == 0 && numY.getImaginaryPart() == 0) {
            return String.format("%f", numX.getRealPart() + numY.getRealPart());
        } else {
            return String.format("%f + i*%f",
                    numX.getRealPart() + numY.getRealPart(),
                    numX.getImaginaryPart() + numY.getImaginaryPart());
        }
    }

    @Override
    public void setNumX(Nums value) {
        super.numX = value;
    }

    @Override
    public void setNumY(Nums value) {
        super.numY = value;
    }

    public static class Main {
        public static void main(String[] args) {
            Model sum = new Model(new Sum(), new PrintToConsole(), new ConsoleInput());
            sum.startCalculating();
        }
    }
}
package CalculatorRationAndComp;

public class Sum extends Calculating{

    public  Sum() {
    }

    @Override
    public String result() {
        if (numberX.getImaginaryPart() == 0 && numberY.getImaginaryPart() == 0) {
            return String.format("%f", numberX.getRealPart() + numberY.getRealPart());
        } else {
            return String.format("%f + i*%f",
                    numberX.getRealPart() + numberY.getRealPart(),
                    numberX.getImaginaryPart() + numberY.getImaginaryPart());
        }
    }

    @Override
    public void setNumberX(Nums value) {
        super.numberX = value;
    }

    @Override
    public void setNumberY(Nums value) {
        super.numberY = value;
    }

}

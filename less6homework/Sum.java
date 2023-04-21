package less6homework;

public class Sum extends Calculating{

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
}
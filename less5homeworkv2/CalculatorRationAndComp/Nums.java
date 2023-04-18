package CalculatorRationAndComp;

public class Nums {
    private double realPart;
    private double imaginaryPart;

    public Nums(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Nums(double realPart){
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}

package CalculatorRationAndComp;

public class Main {
    public static void main(String[] args) {
        Controler sum = new Controler(new Sum(), new FoV());
        sum.startCalculating();
    }
}
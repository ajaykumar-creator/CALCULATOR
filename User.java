package CalculatorSystem;

public class User implements UserInterface {
    private int num1;
    private int num2;
    private int num3;
    private String calculatorType;
    private Adder adder;
    private Multiplier multiplier;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public Adder getAdder() {
        return adder;
    }

    public void setAdder(Adder adder) {
        this.adder = adder;
    }

    public Multiplier getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Multiplier multiplier) {
        this.multiplier = multiplier;
    }


    public void setAdd(Adder adder) {
        this.adder = adder;
    }

    public void setMulti(Multiplier multiplier) {
        this.multiplier = multiplier;
    }
}

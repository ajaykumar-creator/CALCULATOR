package CalculatorSystem;

public class Adder extends Calculator implements AdderInterface {

    Adder(String CalculatorId) {
        setCalculatorId(CalculatorId);
    }

    @Override
    public int compute() {
        int result = getUser().getNum1() + getUser().getNum2() + getUser().getNum3();
        System.out.println(result);
        return result;
    }
}

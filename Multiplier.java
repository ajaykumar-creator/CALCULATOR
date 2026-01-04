package CalculatorSystem;

public class Multiplier extends Calculator {

    Multiplier(String CalculatorId){
        setCalculatorId(CalculatorId);
    }

    @Override
    public int compute() {
        int result = getUser().getNum1() * getUser().getNum2() * getUser().getNum3();
        System.out.println(result);
        return result;
    }
}

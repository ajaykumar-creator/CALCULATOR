package CalculatorSystem;

/*
🧮 *Assignment: Calculator System*

*Entities:* User, Adder, Multiplier

─────────────────
*LEVEL 1: Basic (V1)*
─────────────────

*User.java*
• num1, num2, num3, calculatorType
• calculatorId, result
• getters/setters

*Adder.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 + num2 + num3

*Multiplier.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 * num2 * num3

*Main:* Pass data User → Main → Adder/Multiplier → Main → User


*Note all should be with Terminal inputs*

─────────────────
*LEVEL 2: Association (V2)*
─────────────────

*Problem:* Main is middleman

*Solution:* Share addresses!

*User:*
• Remove: calculatorId, result
• Add: adder variable, multiplier variable

*Adder:*
• Remove: num1, num2, num3
• Add: user variable

*Multiplier:*
• Remove: num1, num2, num3
• Add: user variable

─────────────────
*LEVEL 3: Redundancy (Abstract)*
─────────────────

*Problem:* Adder & Multiplier have duplicate code

*Solution:* Create abstract class!
─────────────────
*LEVEL 4: Security (Interface)*
─────────────────

*Problem:* Implementation exposed

*Solution:* Create interfaces!

*CalculatorInterface*
• getCalculatorId(), setCalculatorId()
• getResult(), setResult()
• compute()

*AdderInterface extends CalculatorInterface*

*MultiplierInterface extends CalculatorInterface*

*Updated Classes:*
• Calculator implements CalculatorInterface
• Adder extends Calculator implements AdderInterface
• Multiplier extends Calculator implements MultiplierInterface

─────────────────
*LEVEL 5: Overloading*
─────────────────

*Concept:* Same method name, different parameters

*Add to Calculator.java:*

calculate(int a) → return a + a

calculate(int a, int b) → return a + b

calculate(int a, int b, int c) → return a + b + c

*Usage in Main:*
calculator.calculate(5) → 10
calculator.calculate(5, 3) → 8
calculator.calculate(5, 3, 2) → 10

─────────────────
*LEVEL 6: Overriding*
─────────────────

*Concept:* Child changes parent's method

*Calculator (Parent):*
compute() → num1 + num2

*Adder (Child) - OVERRIDES:*
@Override compute() → num1 + num2 + num3

*Multiplier (Child) - OVERRIDES:*
@Override compute() → num1 * num2 * num3
─────────────────
*INPUT:*
─────────────────

User1: num1=5, num2=3, num3=2, type=Adder
User2: num1=4, num2=3, num3=2, type=Multiplier

─────────────────
*OUTPUT:*
─────────────────

*USER1 (Adder):*
Overload: 10, 8, 10
Override: 10

*USER2 (Multiplier):*
Overload: 8, 7, 9
Override: 24

─────────────────
*PROGRESSION:*
─────────────────

📗 Level 1 → V1 Basic (Separate classes, Main passes data)
📘 Level 2 → V2 Association (Objects hold references)
📙 Level 3 → Abstract class (Remove redundancy)
📕 Level 4 → Interface (Add security)
📓 Level 5 → Overloading (Same name, different params)
📔 Level 6 → Overriding (Child changes parent method)
*/


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserInterface user1 = new User();

        System.out.println("USER1");

        System.out.println("Enter the number1:");
        BigInteger inputNum1 = new BigInteger(scanner.nextLine());
        user1.setNum1(inputNum1.intValue());

        System.out.println("Enter the number2:");
        BigInteger inputNum2 = new BigInteger(scanner.nextLine());
        user1.setNum2(inputNum2.intValue());

        System.out.println("Enter the number3:");
        BigInteger inputNum3 = new BigInteger(scanner.nextLine());
        user1.setNum3(inputNum3.intValue());

        System.out.println("calculatorType:");
        String type = scanner.nextLine();
        user1.setCalculatorType(type);

        if (user1.getCalculatorType().equals("Adder")) {

            Adder add = new Adder("z123");
            add.setUser(user1);
            add.compute();

        } else if (user1.getCalculatorType().equals("Multipler")) {

            Multiplier multiplier = new Multiplier("z123");
            multiplier.setUser(user1);
            multiplier.compute();

        } else {
            System.out.println("Not valid calculatorType");
        }


        UserInterface user2 = new User();

        System.out.println("USER2");

        System.out.println("Enter the number1:");
        BigInteger num1 = new BigInteger(scanner.nextLine());
        user2.setNum1(num1.intValue());

        System.out.println("Enter the number2:");
        BigInteger num2 = new BigInteger(scanner.nextLine());
        user2.setNum2(num2.intValue());

        System.out.println("Enter the number3:");
        BigInteger num3 = new BigInteger(scanner.nextLine());
        user2.setNum3(num3.intValue());

        System.out.println("calculatorType:");
        String cType = scanner.nextLine();
        user2.setCalculatorType(cType);

        if (user2.getCalculatorType().equals("Adder")) {

            Adder add = new Adder("CV345");
            add.setUser(user2);
            add.compute();

        } else if (user2.getCalculatorType().equals("Multipler")) {

            Multiplier multiplier = new Multiplier("CV456");
            multiplier.setUser(user2);
            multiplier.compute();

        } else {
            System.out.println("Not valid calculatorType");
        }
    }
}

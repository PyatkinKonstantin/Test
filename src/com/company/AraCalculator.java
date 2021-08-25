package com.company;

public class AraCalculator {
    public static int araCalculator() {

        String[] a_b = Parsing.parsing(Solution.operation); //Строковый массив с значениями a и b (Или 6+7 , или VI+VII)

           int a = Integer.parseInt(a_b[0].trim());
           int b = Integer.parseInt(a_b[1].trim());

        if (Parsing.oper.equals("+")) {
            Solution.result = Operations.summa(a, b);
        }
        if (Parsing.oper.equals("-")) {
            Solution.result = Operations.sub(a, b);
        }
        if (Parsing.oper.equals("*")) {
            Solution.result = Operations.mult(a, b);
        }
        if (Parsing.oper.equals("/")) {
            Solution.result = Operations.div(a, b);
        }
        return Solution.result;
    }
}

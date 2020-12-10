package com.company;

public class AraCalculator {
    public static int araCalculator() {

        String[] a_b = Parsing.parsing(Solution.operation); //Строковый массив с значениями a и b (Или 6+7 , или VI+VII)

           int a = Integer.parseInt(a_b[0].trim());
           int b = Integer.parseInt(a_b[1].trim());

        if (Parsing.oper.equals("+")) {
            Solution.result = Sum.summa(a, b);
        }
        if (Parsing.oper.equals("-")) {
            Solution.result = Sub.sub(a, b);
        }
        if (Parsing.oper.equals("*")) {
            Solution.result = Mult.mult(a, b);
        }
        if (Parsing.oper.equals("/")) {
            Solution.result = Div.div(a, b);
        }
        return Solution.result;
    }
}

package com.company;

public class RomeCalculator {
    public static int romeCalculator() {
        String[] a_b = Parsing.parsing(Solution.operation);                //Строковый массив с значениями a и b (Или 6+7 , или VI+VII)

        int x1 = Rome.getArab(a_b[0].trim());      //Первое значение
        int x2 = Rome.getArab(a_b[1].trim());      //Второе значение

        if (Parsing.oper.equals("+")) {             //Если переменная Parsing.oper = "+",
            Solution.result = Sum.summa(x1, x2);    //то вызываем метод summa
        }
        if (Parsing.oper.equals("-")) {
            Solution.result = Sub.sub(x1, x2);
        }
        if (Parsing.oper.equals("*")) {
            Solution.result = Mult.mult(x1, x2);
        }
        if (Parsing.oper.equals("/")) {
            Solution.result = Div.div(x1, x2);
        }

        return Solution.result;
    }
}

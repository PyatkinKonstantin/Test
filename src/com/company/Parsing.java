package com.company;

public class Parsing {
    public static String oper;      //Название операции

    public static String[] parsing(String str) {
        char[] op = str.toCharArray();
        String[] ab = new String[2];
        for (int x = 0; x < op.length; x++) {
            if (op[x] == '+') {                   //Находим название операции
                oper = "+";                       //Присваиваем переменную операции
                ab = str.split("\\+");      //Режем строку по знаку +
            }
            if (op[x] == '-') {
                oper = "-";
                ab = str.split("-");
            }
            if (op[x] == '/') {
                oper = "/";
                ab = str.split("/");
            }
            if (op[x] == '*') {
                oper = "*";
                ab = str.split("\\*");
            }
        }


        return ab;  //Строковый массив с значениями a и b (Или 6+7 , или VI+VII)


    }



}

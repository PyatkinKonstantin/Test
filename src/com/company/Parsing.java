package com.company;

public class Parsing {
    public static String oper;      //Название операции

    public static String[] parsing(String str) {
        char[] op = str.toCharArray();
        String[] ab = new String[2];
        for (char c : op) {
            if (c == '+') {                   //Находим название операции
                oper = "+";                       //Присваиваем переменную операции
                ab = str.split("\\+");      //Режем строку по знаку +
            }
            if (c == '-') {
                oper = "-";
                ab = str.split("-");
            }
            if (c == '/') {
                oper = "/";
                ab = str.split("/");
            }
            if (c == '*') {
                oper = "*";
                ab = str.split("\\*");
            }
        }


        return ab;  //Строковый массив с значениями a и b (Или 6+7 , или VI+VII)


    }



}

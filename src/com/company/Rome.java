package com.company;

public class Rome {
    static String I = "I";
    static String II = "II";
    static String III = "III";
    static String IV = "IV";
    static String V = "V";
    static String VI = "VI";
    static String VII = "VII";
    static String VIII = "VIII";
    static String IX = "IX";
    static String X = "X";
    static String L = "L";
    static String C = "C";
    static String str = "";

    public static int getArab(String romeNum) {
        int araNum=1;
        if (romeNum.equals(I)) {
            araNum = 1;
        }
        if (romeNum.equals(II)) {
            araNum = 2;
        }
        if (romeNum.equals(III)) {
            araNum = 3;
        }
        if (romeNum.equals("IV")) {
            araNum = 4;
        }
        if (romeNum.equals("V")) {
            araNum = 5;
        }
        if (romeNum.equals("VI")) {
            araNum = 6;
        }
        if (romeNum.equals("VII")) {
            araNum = 7;
        }
        if (romeNum.equals("VIII")) {
            araNum = 8;
        }
        if (romeNum.equals("IX")) {
            araNum = 9;
        }
        if (romeNum.equals("X")) {
            araNum = 10;
        }

        return araNum;
    }

   public static void getRomeFromAra(int araResult) {
        int x = araResult;
       int esliOtricetelnoe = x;
        x=Math.abs(x);
        //Сотни

       int xxx=x/100;
       if (xxx==1){str = C;x=xxx*100;}

       //Десятки
       int xx=x/10;
       if (xx==0){str = str;}
       if (xx==9){str = X+C;        x=x-xx*10;}
       if (xx==8){str = L+X+X+X;    x=x-xx*10;}
       if (xx==7){str = L+X+X;      x=x-xx*10;}
       if (xx==6){str = L+X;        x=x-xx*10;}
       if (xx==5){str = L;          x=x-xx*10;}
       if (xx==4){str = X+L;        x=x-xx*10;}
       if (xx==3){str = X+X+X;      x=x-xx*10;}
       if (xx==2){str = X+X;        x=x-(xx*10);}
       if (xx==1){str = X;          x=x-xx*10;}

       //Еденицы
        if (x==0) {str = str;}
        if (x==1) {str = str + I;}
        if (x==2) {str = str + II;}
        if (x==3) {str = str + III;}
        if (x==4) {str = str + IV;}
        if (x==5) {str = str + V;}
        if (x==6) {str = str + VI;}
        if (x==7) {str = str + VII;}
        if (x==8) {str = str + VIII;}
        if (x==9) {str = str + IX;}

        if (esliOtricetelnoe<0) {
            StringBuffer strBuffer = new StringBuffer(str);
            strBuffer.insert(0, "-");
            System.out.println(strBuffer.toString());
        }else System.out.println(str);
        str="";
    }
}


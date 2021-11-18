package org.example;

public class RomanToArabic
{
    public static int toArabic(String romanNumber) {
        int arabicNumber = 0;
        boolean condition = true;
        boolean condition9 = true;
        boolean condition400 = true;
        boolean condition4 = true;
        boolean condition90 = true;
        boolean condition900 = true;


        for (int i = 0; i < romanNumber.length(); i++) {
            if (index("IV", romanNumber)  != -1 && condition4) {
                arabicNumber += 4;
                condition4 = false;
            }

            if(index("CD", romanNumber)  != -1 &&  condition400){
              arabicNumber += 400;
              condition400 = false;
            }

            if(index("XC", romanNumber) != -1  && condition90){
                arabicNumber += 90;
                condition90 = false;
            }

            if (index("IX", romanNumber)  != -1 && condition9) {
                arabicNumber += 9;
                condition9 = false;
            }


            if (romanNumber.charAt(i) == 'I' && condition4 && condition9) arabicNumber += 1;
            if (romanNumber.charAt(i) == 'V' && condition4) arabicNumber += 5;
            if (romanNumber.charAt(i) == 'X' && condition9 && condition90 ) arabicNumber += 10;
            if (romanNumber.charAt(i) == 'L') arabicNumber += 50;
            if (romanNumber.charAt(i) == 'C'&& condition400 && condition90) arabicNumber += 100;
            if (romanNumber.charAt(i) == 'D'&& condition400 && condition900) arabicNumber += 500;
            if (romanNumber.charAt(i) == 'M') arabicNumber += 1000;
        }
        return arabicNumber;
    }
    public static int index(String s, String number){
      for(int i = 0; i < number.length() -1; i++){
          if(s.charAt(0) == number.charAt(i) && s.charAt(1) == number.charAt(i+1)){
              return i;
          }
      }
      return -1;
    }
}


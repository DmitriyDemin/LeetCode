// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// 
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II.
//  The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, 
// the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. 
// There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// public int romanToInt(String s)

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task_3_09_05 {
    public static void main(String[] args) {

        System.out.println(getRomanToInt("MCM"));

    }

    public static int getRomanToInt(String RomanNum){

        Map<String, Integer> Roman = new HashMap<>();
        Roman.put("I", 1);
        Roman.put("V", 5);
        Roman.put("X", 10);
        Roman.put("L", 50);
        Roman.put("C", 100);
        Roman.put("D", 500);
        Roman.put("M", 1000);
        Roman.put("IV", 4);
        Roman.put("IX", 9);
        Roman.put("XL", 40);
        Roman.put("XC", 90);
        Roman.put("CD", 400);
        Roman.put("CM", 900);

        RomanNum.toCharArray();
        Map<Integer, String> MapRomanNum = new HashMap<>();
        int count = 1;
        for (int i = 0; i < RomanNum.length(); i++) {
            if (i != RomanNum.length()-1){
                
                if (Character.toString(RomanNum.charAt(i)).equals("I")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("V")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));

                } else if (Character.toString(RomanNum.charAt(i)).equals("I")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("X")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));

                } else if (Character.toString(RomanNum.charAt(i)).equals("X")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("L")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));
                } else if (Character.toString(RomanNum.charAt(i)).equals("X")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("C")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));
                } else if (Character.toString(RomanNum.charAt(i)).equals("C")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("D")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));
                } else if (Character.toString(RomanNum.charAt(i)).equals("C")
                        & Character.toString(RomanNum.charAt(i + 1)).equals("M")) {
                    MapRomanNum.put(count,
                            Character.toString(RomanNum.charAt(i)).concat(Character.toString(RomanNum.charAt(i + 1))));

                } else {
                    MapRomanNum.put(count, Character.toString(RomanNum.charAt(i)));
                }
                } else {
                    MapRomanNum.put(count, Character.toString(RomanNum.charAt(i)));
                } 
                count = count + 1;
            }
            
            int Sum = 0;

            for (int j = 1; j < count; j++) {
                Sum = Sum + Roman.get(MapRomanNum.get(j));
            }

            return Sum;
        }
      
      }
        

    


// Если задана строка, s содержащая только символы '(', ')', '{' '}', '[', ']', то определите, является ли введенная строка допустимой.

// Входная строка допустима, если:

// Открытые квадратные скобки должны быть закрыты скобками того же типа.
// Открытые квадратные скобки должны быть закрыты в правильном порядке.
// Каждой закрывающей скобке соответствует открывающая скобка того же типа.
 

// Пример 1:

// Ввод: s = "()"
// Вывод: true
// Пример 2:

// Ввод: s = "()[]{}"
// Вывод: true
// Пример 3:

// Ввод: s = "(]"
// Вывод: false

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task_6_11_05 {
    public static void main(String[] args) {
        
        System.out.println(isValid("())("));
        
        String s = "[{}]";
        System.out.println(s.contains("[]"));
        
    }
    
    public static boolean isValid(String s) {
      
    boolean ansver = true;
    char [] Arr = s.toCharArray();
    int count = 0;
    Map<Character, Character> staples = new HashMap<Character, Character>();
    staples.put('(',')');
    staples.put('{','}');
    staples.put('[',']');
    staples.put(')',']');
    staples.put(']',']');
    staples.put('}',']');
    for (int i = 0; i < Arr.length; i=i+2){
        ansver = staples.get(Arr[i]) == Arr[i+1];
        if (ansver == true){
            count =count + 1;
    }
    }

    if (count == Arr.length/2 ){
        ansver = true;
    } else {
        ansver = false;
    }

        return ansver;
    }
}

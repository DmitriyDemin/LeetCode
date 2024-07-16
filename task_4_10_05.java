// Напишите функцию для поиска самой длинной строки общего префикса среди массива строк.

// Если общего префикса нет, верните пустую строку "".

// Пример 1:

// Ввод: strs = ["flower","flow","flight"]
// Вывод: "fl"
// Пример 2:

// Ввод: strs = ["dog","racecar","car"]
// Вывод: ""
// Пояснение: Среди входных строк нет общего префикса.



public class task_4_10_05 {

    public static void main(String[] args) {
        
        // longestCommonPrefix("flower","flow","flight");
    String [] strs = new String [] {"flower","flow","flight"};
        // for (int i=0; i< strs.length-1; i++){
            System.out.println(strs[0].compareTo(strs[1]));
            System.out.println(strs[1].compareTo(strs[2]));
            System.out.println(strs[0].compareTo(strs[2]));
            System.out.println(strs[0].indexOf(strs[2]));
            System.out.println(strs[1].startsWith(strs[0]));

String answer = new String("");
// if (strs[0].compareTo(strs[1]) == -1){
//     break;
// } else {
System.out.println(strs[1].charAt(1));
int n = strs[0].compareTo(strs[1]);
System.out.println(n);
    // for (int i = 0; i < strs.length; i++){
    //     for (int j = 0; j < strs[i].length(); j++){
    //         System.out.print(strs[i].charAt(j)); 
        
    //         }
    // }
    
}



    }

    // public String longestCommonPrefix(String[] strs) {
    //     for (int i=0; i< strs.length; i++){
    //         System.out.print(strs[i].compareTo(strs[i+1]));
    //     }


        
        
        
        



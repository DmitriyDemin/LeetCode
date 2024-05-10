// Вам выдается целочисленный массив score размера n, где score[i] - результат ith спортсмена в соревновании. Все результаты гарантированно будут уникальными.

// Спортсмены размещаются на основе их результатов, где у 1st спортсмена, занявшего первое место, самый высокий балл, у 2nd спортсмена, занявшего 2nd первое место, 
// самый высокий балл и так далее. Место каждого спортсмена определяет его ранг:

// Ранг спортсмена на 1st месте равен "Gold Medal".
// Ранг спортсмена на 2nd месте равен "Silver Medal".
// Ранг спортсмена на 3rd месте равен "Bronze Medal".
// Для 4th места, присвоенного nth спортсмену, занявшему xth место, его ранг - это его номер места (т. е. Ранг "x" спортсмена, занявшего место, равен,,,).
// Возвращает массив answer размера n, где answer[i] - ранг ith спортсмена.

// Пример 1:

// Входные данные: оценка = [5,4,3,2,1]
// Вывод: ["Золотая медаль", "Серебряная медаль", "Бронзовая медаль","4","5"]
// Пояснение: Места размещения следующие: [1-е, 2-е, 3-е, 4-е, 5-е].
// Пример 2:

// Входные данные: оценка = [10,3,8,9,4]
// Вывод: ["Золотая медаль", "5", "Бронзовая медаль", "Серебряная медаль", "4"]
// Пояснение: Места размещения следующие: [1-е, 5-е, 3-е, 2-е, 4-е].

import java.util.Arrays;

public class task_1_08_05 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // class Solution {
        //     public String[] findRelativeRanks(int[] score) {
            int [] score = {15,7,1,13,12};
                int n = score.length;
                String [] rang = new String [n];
                int firstMax, secondMax, indexFirstMax, indexSecondMax, firstMin, secondMin, indexFirstMin, indexSecondMin, temp, indexTemp;
                
                if (score[0] > score[1]){
                    firstMax = score[0];
                    indexFirstMax = 0;
                    secondMax = score[1];
                    indexSecondMax = 1;

                } else {
                    firstMax = score[1];
                    indexFirstMax = 1;
                    secondMax = score[0];
                    indexSecondMax = 0;
                }
                for (int i=2; i < score.length; i++){
                    if (score[i] > firstMax){
                        temp = firstMax;
                        indexTemp = indexFirstMax; 
                        firstMax = score[i];
                        indexFirstMax = i;
                        secondMax = temp;
                        indexSecondMax = indexTemp; 
                    
                    } else if (score[i] > secondMax ) {
                        secondMax = score[i];
                        indexSecondMax = i;
                    }
                }

                if (score[0] < score[1]){
                    firstMin = score[0];
                    indexFirstMin = 0;
                    secondMin = score[1];
                    indexSecondMin = 1;

                } else {
                    firstMin = score[1];
                    indexFirstMin = 1;
                    secondMin = score[0];
                    indexSecondMin = 0;
                }
                for (int i=2; i < score.length; i++){
                    if (score[i] < firstMin){
                        temp = firstMin;
                        indexTemp = indexFirstMin;
                        firstMin = score[i];
                        indexFirstMin = i;
                        secondMin = temp;
                        indexSecondMin = indexTemp;
                    } else if (score[i] < secondMin ) {
                        secondMin = score[i];
                        indexSecondMin = i;
                    }
                }
                System.out.println(Arrays.toString(score));
                System.out.print("max: " + firstMax);
                System.out.println(" i max: " + indexFirstMax);
                System.out.print("smax: " +secondMax);
                System.out.println( " i smax: " + indexSecondMax);
                System.out.print("min: " +firstMin);
                System.out.println("i min: " + indexFirstMin);
                System.out.print("smin: " + secondMin);
                System.out.println("i smin: " + indexSecondMin);
                
                rang [indexFirstMax] = "\"Gold Medal\"";
                rang [indexSecondMax] = "\"Silver Medal\"";
                rang [indexSecondMin] = "\"" +  Integer.toString(score[indexSecondMin])+"\"";
                rang [indexFirstMin] = "\"" +  Integer.toString(score[indexFirstMin])+"\"";
                System.err.println(score[indexFirstMax]);
                System.out.println(Arrays.toString(rang));
                int indexBronze = 0;
                
                for (int i =0; i < rang.length; i++){
                    if (rang[i] == null){
                        indexBronze = i;
                    }
                }

                rang [indexBronze] = "\"Bronze Medal\"";
                System.out.println(Arrays.toString(rang));


        
                 
                
                
                
        }
        
        
    }


        
    


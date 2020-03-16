package homework1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] newArr = new int[5][8];
        for (int i = 0; i < newArr.length; i++) { // цикл заполнения элементов массива рандомными числами  в диапозоне[-99;99]
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = ((int) (Math.random() * 199) - 99);
            }}
        int max = newArr[0][0];
        for(int i =0;i< newArr.length;i++){    // цикл сравнения элементов
            for(int j=0; j < newArr[i].length; j++){
                if(newArr[i][j] > max) max = newArr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr));
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = " + max);

        }
    }

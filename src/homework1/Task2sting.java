package homework1;

import java.util.Arrays;

public class Task2sting {
    public static void main(String[] args) {
        String str1= "1 на три равно четыре? невозможно";
        String [] Word = str1.split(" ");
        String maxlethWord = "";
        for(int i = 0; i < Word.length; i++){ // цикл сравнения длины элементов массива
            if(Word[i].length() >= maxlethWord.length()){
                maxlethWord = Word[i]; // запись элемента  с большей длиной в переменную
            }
        }
        System.out.println(maxlethWord);
    }
}

package homeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a, b, count = 0;
        System.out.println(" Введите натуральное число большее 3");
        while (true) {
            Scanner in = new Scanner(System.in);
            double n = in.nextDouble();
            a = (int) n;
            int[] someArr = new int[a];
            for (int i = 0; i < someArr.length; i++) {
                someArr[i] = ((int) (Math.random() * a + 1));   // запись рандомных чисел [0;n] в элементы массива1
            }
            System.out.println(Arrays.toString(someArr));

            for (int i = 0; i < someArr.length; i++) { // узнаем кол-во четных элементов массива1
                if (someArr[i] % 2 != 0) continue;
                else count++;
            }
            int[] someArr2 = new int[count]; // создаем массив2 длиной = кол-ву четных элем-ов массива1
            for (int i = 0, j = 0; i < someArr.length; i++) { //проеряем значения элементов масиива1 на четность
                if (someArr[i] % 2 == 0) {
                   b = someArr[i]; // записываем четный элемент в переменную b
                    someArr2[j] = b;// записываем значения из массива1 в массив2
                    j++;


                }
                if (someArr[i] % 2 != 0) continue;
            }

                System.out.println(Arrays.toString(someArr2));

                if (a < 3) System.out.println("Не правильно попробуй еще раз");
                if (n != a) System.out.println("Не правильно попробуй еще раз");
                else break;

            }

        }


    }



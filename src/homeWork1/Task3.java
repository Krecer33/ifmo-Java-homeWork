package homeWork1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n=5, sum = 0;
        double  average;
        int[] someArr2 = new int[n];
        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] = ((int) (Math.random() * 201) - 100); // записывает  рандомное число в диапозоне [-100;100]
            sum += someArr2[i];
        }
        Arrays.sort(someArr2);
        average = (double) sum/n;
        System.out.println(Arrays.toString(someArr2));
        System.out.println("Минимальное значение = "+someArr2[0]);
        System.out.println("Cреднее значение = " + average);
        System.out.println("Максимальное значение = "+someArr2[n-1]);

    }
}

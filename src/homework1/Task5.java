package homework1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] newArr = new int[5][8];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = ((int) (Math.random() * 199) - 99);
            }
            System.out.println(Arrays.deepToString(newArr));

        }
    }
}

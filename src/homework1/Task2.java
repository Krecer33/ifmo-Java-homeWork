package homework1;

public class Task2 {
    public static void main(String[] args) {
        int[] someArr2 = {1, 2, 3, 4, 5, 6};
        for (int i = 0, j, a; i < someArr2.length; i++) {
            for ( j=i+1; j < someArr2.length; j++) {
                a = someArr2[i]+ someArr2[j];
                if (a==7){
                    System.out.println(someArr2[i] +" + " + someArr2[j]+ " = "+ a);
                }
            }
        }
    }
}

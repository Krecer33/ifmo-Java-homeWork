package homework1;

public class Task1string {
    public static void main(String[] args) {
        String str1 = "Сова";
        String str2 = "Прикол";
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);


    }
}

package homework1;

public class NOD {

// Вычисление Наибольшего Общего Делителя (НОД)
    public static void main(String[] args) {
        int a = 642, b = 54, result, c; // подсталяем заместа А и В два целых числа кроме 0 и  А > B
        c = a % b;
        if (c == 0)   System.out.println(b); //Если b является НОДом

          for(c = a % b;  c!= 0 ; c = b % result ) {
                 result = b % c;

             if (result == 0) { b = c; // если на перый остаток (с) явл-ся НОДом (проверка деления на 0)
                System.out.println(b);
                break; }

                b = c;
                c = b % result;

             if (c == 0){ b = result;// если второи остаток явл-ся НОДом
                System.out.println(b);
             break; }
             }
        }
}






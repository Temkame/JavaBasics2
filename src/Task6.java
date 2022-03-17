/*
Минимум двух чисел

Написать функцию, которая возвращает минимум из двух чисел.
 */
public class Task6 {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        System.out.println(min(10, 40));
        System.out.println(min(80, 125));
        System.out.println(min(1500, 405));
    }
}

/*
Максимум двух чисел

Написать функцию, которая вычисляет максимум из двух чисел.
 */
public class Task7 {
    public static int max (int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(max(15, 30));
        System.out.println(max(45,55));
        System.out.println(max(75,15));
    }
}

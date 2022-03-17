/*
Минимум трёх чисел

Написать функцию, которая вычисляет минимум из трёх чисел.
 */
public class Task8 {
    public static int trax(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(trax(150, 35,44));
    }
}

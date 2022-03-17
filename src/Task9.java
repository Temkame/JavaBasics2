/*
Минимум четырёх чисел

Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */
public class Task9 {
    public static int min (int a, int b, int c, int d) {
        if (min(a, b) < min(c, d)) {
            return min(a, b);
        } else {
            return min(c, d);
        }
    }
    public static int min (int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(1554,547,236,175));
    }
}

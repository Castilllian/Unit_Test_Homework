package Homework_3;
//Разработайте и протестируйте метод numberInInterval,
//который проверяет, попадает ли переданное число в интервал (25;100).
public class Task_1 {
    public class NumberHelper {
        public static boolean numberInInterval(int n) {
            return n > 25 && n < 100;
        }
    }
}

package Homework_1;

import org.assertj.core.api.Assertions;

import static Homework_1.Task_1.calculateDiscount;
//import static org.junit.Assert.assertEquals;

public class Test_1_Task_1 {
    public static void main(String[] args) {
        // Тесты
        // Тестирование скидки 10% на покупку в размере 1000
        double result1 = calculateDiscount(1000, 10);
        Assertions.assertThat(result1).isEqualTo(900);

        // Тестирование скидки 20% на покупку в размере 500
        double result2 = calculateDiscount(500, 20);
        Assertions.assertThat(result2).isEqualTo(400);

        // Тестирование скидки 0% на покупку в размере 200
        double result3 = calculateDiscount(200, 0);
        Assertions.assertThat(result3).isEqualTo(200);

        // Тестирование отрицательной скидки на покупку в размере 100
        Assertions.assertThatThrownBy(() -> calculateDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");

        // Тестирование отрицательной суммы покупки и скидки
        Assertions.assertThatThrownBy(() -> calculateDiscount(-100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}
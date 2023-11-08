package Homework_3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Test_for_task_1 {
    public class NumberHelperTest {
        @ParameterizedTest
        @ValueSource(ints = {24, 25, 50, 99, 100, 101})
        @DisplayName("Тест для метода numberInInterval")
        public void numberInIntervalTest(int number) {
            if (number > 25 && number < 100) {
                assertTrue(Task_1.NumberHelper.numberInInterval(number));
            } else {
                assertFalse(Task_1.NumberHelper.numberInInterval(number));
            }
        }
    }
}

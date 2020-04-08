import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void shouldReturn4613732WhenWeGiveFourMilion() {

        //given
        FibUtil systemUnderTest = new FibUtil();
        long limit = 4000000;
        //when
        long result = systemUnderTest.sumOfEvenFibonacciNumbers(limit);
        //then
        long expectedResult = 4613732;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnZeroWhenWeGiveAMinusNumber() {

        //given
        FibUtil systemUnderTest = new FibUtil();
        long limit = -30;
        //when
        long result = systemUnderTest.sumOfEvenFibonacciNumbers(limit);
        //then
        long expectedResult = 0;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnFourtyFourWhenWeGiveSeventy() {
        //given
        FibUtil systemUnderTest = new FibUtil();
        long limit = 70;
        //when
        long result = systemUnderTest.sumOfEvenFibonacciNumbers(limit);
        //then
        long expectedResult = 44;
        Assertions.assertEquals(expectedResult, result);
    }
}


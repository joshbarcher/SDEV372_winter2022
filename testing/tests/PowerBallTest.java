import org.junit.jupiter.api.RepeatedTest;
import random.PowerBall;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerBallTest
{
    @RepeatedTest(100)
    public void testPowerBallNumbers()
    {
        //arrange, act
        PowerBall ball = new PowerBall();
        int[] numbers = ball.getNumbers();
        System.out.println(ball);

        //assert (assume we have six numbers)
        for (int i = 0; i < numbers.length - 1; i++) //test the first five numbers
        {
            assertTrue(numbers[i] >= 1);
            assertTrue(numbers[i] <= 69);
        }

        //test the last number
        assertTrue(numbers[numbers.length -1] >= 1);
        assertTrue(numbers[numbers.length -1] <= 26);
    }
}

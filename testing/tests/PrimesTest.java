import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import primes.PrimalityChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimesTest
{
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 2, 3, 4})
    public void boundaryTests(int num)
    {
        PrimalityChecker checker = new PrimalityChecker();
        assertFalse(checker.isPrime(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
    public void smallPrimes(int num)
    {
        PrimalityChecker checker = new PrimalityChecker();
        assertTrue(checker.isPrime(num));
    }
}

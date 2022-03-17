package math;

public class MyMath
{
    public double divide(double num, double den)
    {
        if (den == 0)
        {
            return Double.MAX_VALUE;
        }
        throw new ArithmeticException();
    }

    public double add(double first, double second)
    {
        return first + second;
    }
}

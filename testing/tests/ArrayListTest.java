import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest
{
    private ArrayList<Integer> list;

    @BeforeEach
    public void setup()
    {
        System.out.println("Created a new list");
        list = new ArrayList<>();
    }

    @Test
    public void testSize()
    {
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeIncreased()
    {
        list.add(10);
        assertEquals(1, list.size());
    }
}

import names.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    @Test
    public void testConstructor()
    {
        Person me = new Person("Josh", "Archer");

        //verify that all fields are assigned as expected
        assertAll(
            () -> assertEquals("Josh", me.getFirst()),
            () -> assertEquals("Archer", me.getLast()),
            () -> assertNull(me.getTitle()),
            () -> assertSame('\u0000', me.getMiddle())
        );
    }
}

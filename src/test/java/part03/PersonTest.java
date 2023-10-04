package part03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testGetAge() {
        var ross = new Person("Ross", 33);

        assertEquals(33, ross.getAge());
    }

    @Test
    void testGetName() {
        var monica = new Person("Monica", 29);

        assertEquals("Monica", monica.getName());
    }

    @Test
    void testToString() {
        var rachel = new Person("Rachel", 28);

        assertEquals("Person [name=Rachel, age=28]", rachel.toString());
    }
}

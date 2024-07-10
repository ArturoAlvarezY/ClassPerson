import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.arturo.models.Person;

public class PersonTest {
    Person testingPerson = new Person("Bumby", "Alvarez", 2004, "its a dog");

    @Test
    void testGetBorningYear() {
    assertEquals(2004, testingPerson.getBorningYear() );
    }

    @Test
    void testGetDni() {
    assertEquals("its a dog", testingPerson.getDni());
    }

    @Test
    void testGetLastName() {
        assertEquals("Alvarez", testingPerson.getLastName());

    }

    @Test
    void testGetName() {
        assertEquals("Bumby", testingPerson.getName());
    }

    @Test
    void testPrintingPerson() {
        assertEquals(testingPerson, testingPerson);
    }
}

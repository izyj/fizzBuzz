import org.example.FizzBuzz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class FizzBuzzTests {



    @Test
    @DisplayName("Wrong number should not return fizz word")
    public void testFizzFalse(){

        assertFalse(FizzBuzz.fizzbuzzTransform(1).equals("Fizz"));
        assertFalse(FizzBuzz.fizzbuzzTransform(1).equals("Buzz"));
        assertFalse(FizzBuzz.fizzbuzzTransform(1).equals("FizzBuzz"));

    }

    @Test
    @DisplayName("Only fizz should be true")
    public void testFizzTrue(){

        assertEquals(FizzBuzz.fizzbuzzTransform(3),"Fizz");
        assertNotEquals(FizzBuzz.fizzbuzzTransform(3),"Buzz");
        assertNotEquals(FizzBuzz.fizzbuzzTransform(3),"FizzBuzz");

    }

    @Test
    @DisplayName("Only buzz should be true")
    public void testBuzzTrue(){

        assertNotEquals(FizzBuzz.fizzbuzzTransform(5),"Fizz");
        assertEquals(FizzBuzz.fizzbuzzTransform(5),"Buzz");
        assertNotEquals(FizzBuzz.fizzbuzzTransform(5),"FizzBuzz");

    }


    @Test
    @DisplayName("fizz, buzz, and fizzbuzz should be true")
    public void testFizzBuzzTrue(){

        assertNotEquals(FizzBuzz.fizzbuzzTransform(15),"Fizz");
        assertNotEquals(FizzBuzz.fizzbuzzTransform(15),"Buzz");
        assertEquals(FizzBuzz.fizzbuzzTransform(15),"FizzBuzz");

    }
}

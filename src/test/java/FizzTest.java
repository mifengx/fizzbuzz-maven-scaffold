import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.fest.assertions.api.Assertions.assertThat;

public class FizzTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test() {
        assertThat(Fizz.compute(3)).isEqualTo("Fizz");
        assertThat(Fizz.compute(5)).isEqualTo("Buzz");
        assertThat(Fizz.compute(7)).isEqualTo("Whizz");
        assertThat(Fizz.compute(15)).isEqualTo("FizzBuzz");
        assertThat(Fizz.compute(21)).isEqualTo("FizzWhizz");
        assertThat(Fizz.compute(35)).isEqualTo("BuzzWhizz");

    }

    @Test
    public void testEx() throws IllegalArgumentException {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("wrong input");
        Fizz.compute(-1);
    }


}
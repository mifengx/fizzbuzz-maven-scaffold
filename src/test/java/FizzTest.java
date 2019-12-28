import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class FizzTest {
    @Test
    public void Test(){
        assertThat(Fizz.compute(3)).isEqualTo("Fizz");
        assertThat(Fizz.compute(5)).isEqualTo("Buzz");
    }

}
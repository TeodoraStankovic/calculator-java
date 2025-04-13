import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateSimpleAddition() {
        List<Float> numbers = Arrays.asList(4.0f, 5.0f);
        List<String> operations = Arrays.asList("+");

        Calculator.Run("4+5"); // pokreće metodu i ažurira finalResult interno
        assertEquals(9.0f, Float.parseFloat(Calculator.Run("4+5")), 0.001f);
    }
}
 

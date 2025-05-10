import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int result = calculator.sum(2,3);
    System.out.println("Result-vinay: " + result);
    assertEquals(6, result);
  }

}
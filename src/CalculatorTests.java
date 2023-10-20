import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTests {

    @Test
    public void add_Test(){
        // Arrange
        Calculator c = new Calculator();

        // Act
        int result = c.add(2, 3);

        // Assert
        assertEquals(5, result);
        assertNotEquals(6, result);
    }
}

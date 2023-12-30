import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Testmain {
    @Test
    public void testInputIsEven(){
        assertFalse(Main.checkIfInputIsAnEvenNumber(23));
        assertTrue(Main.checkIfInputIsAnEvenNumber(22));
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUI {
    @Test
    public void testDimensions() {
        TicTacToe ticTacToe = new TicTacToe();

        int height = ticTacToe.getHeight();
        int width = ticTacToe.getWidth();

        assertEquals(600, height);
        assertEquals(400, width);
    }

}

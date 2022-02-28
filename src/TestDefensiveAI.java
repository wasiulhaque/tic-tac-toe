import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestDefensiveAI {
    @Test
    public void test_row1() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"X", "X", "Click"},
                {"Click", "0", "Click"},
                {"Click", "0", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {0,2}; // row: 0 col: 2
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_row2() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"0", "0", "Click"},
                {"X", "X", "Click"},
                {"Click", "Click", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {1,2}; // row: 1 col: 2
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_row3() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"Click", "0", "Click"},
                {"Click", "0", "Click"},
                {"X", "X", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {2,2}; // row: 2 col: 2
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_column1() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"X", "Click", "Click"},
                {"X", "0", "Click"},
                {"Click", "0", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {2,0}; // row: 2 col: 0
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_column2() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"Click", "X", "0"},
                {"0", "Click", "Click"},
                {"Click", "X", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {1,1}; // row: 1 col: 1
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_column3() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"Click", "Click", "X"},
                {"0", "0", "Click"},
                {"Click", "Click", "X"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {1,2}; // row: 1 col: 2
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_diagonal1() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"X", "Click", "Click"},
                {"0", "X", "Click"},
                {"Click", "0", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {2,2}; // row: 2 col: 2
        Assert.assertEquals(expected,defAI);
    }

    @Test
    public void test_diagonal2() {
        Integer[] defAI;
        DefensiveAI defensiveAI1 = new DefensiveAI();
        String[][] mazeText = {
                {"0", "Click", "X"},
                {"0", "X", "Click"},
                {"Click", "Click", "Click"}
        };

        defAI = defensiveAI1.makeMove(mazeText);
        Integer[] expected = {2,0}; // row: 2 col: 0
        Assert.assertEquals(expected,defAI);
    }
}
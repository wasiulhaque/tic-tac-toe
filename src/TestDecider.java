import org.junit.Test;
import org.testng.Assert;

public class TestDecider {
    @Test
    public void testGameColumnsHuman1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"X", "Click", "Click"},
                {"X", "X", "Click"},
                {"X", "0", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameColumnsHuman2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "X", "0"},
                {"Click", "X", "Click"},
                {"Click", "X", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameColumnsHuman3() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "0", "X"},
                {"Click", "Click", "X"},
                {"Click", "0", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameColumnsAI1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"0", "Click", "Click"},
                {"0", "Click", "X"},
                {"0", "Click", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameColumnsAI2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "0", "Click"},
                {"Click", "0", "X"},
                {"Click", "0", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameColumnsAI3() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "X", "0"},
                {"Click", "X", "0"},
                {"Click", "Click", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsHuman1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"X", "X", "X"},
                {"Click", "Click", "Click"},
                {"0", "Click", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsHuman2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "Click", "Click"},
                {"X", "X", "X"},
                {"0", "Click", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsHuman3() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "Click", "Click"},
                {"Click", "0", "0"},
                {"X", "X", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsAI1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"0", "0", "0"},
                {"Click", "Click", "Click"},
                {"Click", "X", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsAI2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "Click", "Click"},
                {"0", "0", "0"},
                {"Click", "X", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameRowsAI3() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "Click", "Click"},
                {"Click", "X", "X"},
                {"0", "0", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameDiagonalsHuman1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"X", "0", "0"},
                {"Click", "X", "Click"},
                {"0", "Click", "X"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameDiagonalsHuman2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"Click", "Click", "X"},
                {"Click", "X", "Click"},
                {"X", "0", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Human has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameDiagonalsAI1() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"0", "Click", "X"},
                {"Click", "0", "Click"},
                {"X", "Click", "0"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameDiagonalsAI2() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"X", "X", "0"},
                {"Click", "0", "Click"},
                {"0", "Click", "Click"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "AI has won";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGameDraw() {
        String winner;
        Decider decider = new Decider();
        String[][] mazeText = {
                {"X", "X", "0"},
                {"0", "0", "X"},
                {"Click", "Click", "Click"}
        };

        winner = decider.getWinner(mazeText);
        String actual = decider.returnWinner(winner);
        String expected = "Draw between human and AI";
        Assert.assertEquals(expected, actual);
    }



}

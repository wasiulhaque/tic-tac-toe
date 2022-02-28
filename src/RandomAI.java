import java.util.Random;

public class RandomAI implements AI {
    public Integer[] makeMove(String[][] mazeText){
        Integer[] randMove = new Integer[2];
        Random randomGen = new Random();
        do {
            randMove[0] = randomGen.nextInt(3);
            randMove[1] = randomGen.nextInt(3);
        } while (!mazeText[randMove[0]][randMove[1]].equals("Click"));

        return randMove;

    }
}

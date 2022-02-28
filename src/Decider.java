

public class Decider {

    String playerSign = "X";
    String aiSign = "0";
    String emptySign = "Click";

    public boolean checkMoveLeft(String[][] mazeText){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(mazeText[i][j].equals(emptySign)){
                   return true;
               }
            }
        }
        return false;
    }

    public boolean checkEnded(String[][] mazeText){
        String winner = getWinner(mazeText);
        if(winner.equals("Keep playing"))
            return false;
        else
            return true;
    }


    public String traverseColumn(String[][] mazeText, int column){
        String maze0, maze1, maze2;
        maze0 = mazeText[0][column];
        maze1 = mazeText[1][column];
        maze2 = mazeText[2][column];

        if(maze0.equals(maze1) && maze1.equals(maze2) && !maze0.equals(emptySign)) {
            return maze0;
        } else
            return "Clear";
    }

    public String traverseRow(String[][] mazeText, int row){
        String maze0, maze1, maze2;
        maze0 = mazeText[row][0];
        maze1 = mazeText[row][1];
        maze2 = mazeText[row][2];

        if(maze0.equals(maze1) && maze1.equals(maze2) && !maze0.equals(emptySign)) {
            return maze0;

        } else
            return "Clear";
    }

    public String traverseBothDiagonals(String[][] mazeText){
        String maze00, maze11, maze22, maze02, maze20;
        maze00 = mazeText[0][0];
        maze11 = mazeText[1][1];
        maze22 = mazeText[2][2];

        if (maze00.equals(maze11) && maze11.equals(maze22) && !maze00.equals(emptySign)) {
            return maze00;
        }
        maze02 = mazeText[0][2];
        maze20 = mazeText[2][0];

        if (maze02.equals(maze11) && maze11.equals(maze20) && !maze20.equals(emptySign)) {
            return maze02;
        }
        else
            return "Clear";
    }

    public String traverseAllRows(String[][] mazeText){
        String winner;
        for(int i=0;i<3;i++){
            winner = traverseRow(mazeText,i);
            if(winner.equals(playerSign) || winner.equals(aiSign))
                return winner;
        }
        return "Clear";
    }
    public String traverseAllColumns(String[][] mazeText){
        String winner;
        for(int i=0;i<3;i++){
            winner = traverseColumn(mazeText,i);
            if(winner.equals(playerSign) || winner.equals(aiSign))
                return winner;
        }
        return "Clear";
    }


    public String getWinner(String[][] mazeText){
        String winnerSign;
        winnerSign = traverseAllColumns(mazeText);
        if(winnerSign.equals(aiSign) || winnerSign.equals(playerSign))
            return winnerSign;
        winnerSign = traverseAllRows(mazeText);
        if(winnerSign.equals(aiSign) || winnerSign.equals(playerSign))
            return winnerSign;
        winnerSign = traverseBothDiagonals(mazeText);
        if(winnerSign.equals(aiSign) || winnerSign.equals(playerSign))
            return winnerSign;
        if(!checkMoveLeft(mazeText))
            return "Draw";
        return "Keep playing";
        }
        
    public String returnWinner(String winnerSign){
        if(winnerSign.equals(playerSign))
            return "Human has won";
        else if(winnerSign.equals(aiSign))
            return "AI has won";
        else
            return "Draw between human and AI";
    }    

}

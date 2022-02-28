

public class DefensiveAI implements AI {
    
    String aiSign = "0";
    String playerSign = "X";
    String emptySign = "Click";
    
    public Integer[] makeMove(String[][] mazeText){
        String mazeCheck;
        Integer[] aiMove = new Integer[2];
        mazeCheck = checkCloseToVictory(mazeText);
        if(mazeCheck.equals("Clear")){ // not close to victory so random move
            RandomAI randomAI = new RandomAI();
             aiMove = randomAI.makeMove(mazeText);
        } else{
            aiMove[0] = Integer.parseInt(mazeCheck.substring(0,1));
            aiMove[1] = Integer.parseInt(mazeCheck.substring(1,2));
        }
        return aiMove;
    }

    public String traverseColumn(String[][] mazeText, int column){
        String maze0, maze1, maze2;
        maze0 = mazeText[0][column];
        maze1 = mazeText[1][column];
        maze2 = mazeText[2][column];

        if(maze0.equals(playerSign) && maze1.equals(playerSign) && maze2.equals(emptySign)){
            return "2" + column;
        } else if(maze0.equals(playerSign) && maze2.equals(playerSign) && maze1.equals(emptySign)){
            return "1" + column;
        } else if(maze1.equals(playerSign) && maze2.equals(playerSign) && maze0.equals(emptySign)){
            return aiSign + column;
        } else
            return "Clear";
    }

    public String traverseRow(String[][] mazeText, int row){
        String maze0, maze1, maze2;
        maze0 = mazeText[row][0];
        maze1 = mazeText[row][1];
        maze2 = mazeText[row][2];

        if(maze0.equals(playerSign) && maze1.equals(playerSign) && maze2.equals(emptySign)){
            return row + "2";
        } else if(maze0.equals(playerSign) && maze2.equals(playerSign) && maze1.equals(emptySign)){
            return row + "1";
        } else if(maze1.equals(playerSign) && maze2.equals(playerSign) && maze0.equals(emptySign)){
            return row + "0";
        } else
            return "Clear";
    }

    public String traverseDiagonals(String[][] mazeText) {
        String maze00, maze11, maze22, maze02, maze20;
        maze00 = mazeText[0][0];
        maze11 = mazeText[1][1];
        maze22 = mazeText[2][2];

        if (maze00.equals(playerSign) && maze11.equals(playerSign) && maze22.equals(emptySign)) {
            return "22";
        } else if (maze00.equals(playerSign) && maze22.equals(playerSign) && maze11.equals(emptySign)) {
            return "11";
        } else if (maze11.equals(playerSign) && maze22.equals(playerSign) && maze00.equals(emptySign)) {
            return "00";
        }

        maze02 = mazeText[0][2];
        maze20 = mazeText[2][0];

        if (maze02.equals(playerSign) && maze11.equals(playerSign) && maze20.equals(emptySign)) {
            return "20";
        } else if (maze02.equals(playerSign) && maze20.equals(playerSign) && maze11.equals(emptySign)) {
            return "11";
        } else if (maze11.equals(playerSign) && maze20.equals(playerSign) && maze02.equals(emptySign)) {
            return "02";
        } else
            return "Clear";
    }

    public String checkAllColumns(String[][] mazeText){
        String mazeCheck;
        for(int i=0;i<3;i++){
            mazeCheck = traverseColumn(mazeText,i);
            if(!mazeCheck.equals("Clear"))
                return mazeCheck;
        }
        return "Clear";
    }

    public String checkAllRows(String[][] mazeText){
        String mazeCheck;
        for(int i=0;i<3;i++){
            mazeCheck = traverseRow(mazeText,i);
            if(!mazeCheck.equals("Clear"))
                return mazeCheck;
        }
        return "Clear";
    }

    public String checkCloseToVictory(String[][] mazeText){
        String mazeCheck;

        mazeCheck = traverseDiagonals(mazeText);
        if(!mazeCheck.equals("Clear"))
            return mazeCheck;

        mazeCheck = checkAllColumns(mazeText);
        if(!mazeCheck.equals("Clear"))
            return mazeCheck;

        mazeCheck = checkAllRows(mazeText);
        if(!mazeCheck.equals("Clear"))
            return mazeCheck;
        return "Clear";
    }
}
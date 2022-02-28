import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    public JButton[] aiSelectButton = new JButton[2];
    public JButton[][] maze = new JButton[3][3];
    public String[] themeName = {"Classic", "Forrest", "High Contrast"};
    public String[][] mazeText = new String[3][3];
    public Integer[] aiMoves = new Integer [2];
    public String winner;
    public JLabel status;
    AI playingAI;
    Dimension dimension = new Dimension(355,30);
    Decider decider = new Decider();
    Player player = new Player();

    public TicTacToe() {
        Controls controls = new Controls("Start Game", dimension,maze,aiSelectButton,status);
        add(controls);
        createAISelectButtons();
        createThemeSelectButtons();
        createStatusBar();
        initializeGame();
        makeLayoutVisible();
    }

    //Game can be started from here

    public static void main(String[] args) {
        TicTacToe GUI = new TicTacToe();
        GUI.setResizable(false);
    }

    //Methods for initializing UI

    public void initializeGame(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maze[i][j] = new JButton("Click");
                maze[i][j].setPreferredSize(new Dimension(100,100));
                maze[i][j].addActionListener(this);
                maze[i][j].setEnabled(false);
                add(maze[i][j]);
            }
        }
    }

    public void createAISelectButtons(){
        aiSelectButton[0] = new JButton("Start With Random AI");
        aiSelectButton[0].setPreferredSize(new Dimension(355,30));
        aiSelectButton[0].addActionListener(this);
        add(aiSelectButton[0]);

        aiSelectButton[1] = new JButton("Start With Defensive AI");
        aiSelectButton[1].setPreferredSize(new Dimension(355,30));
        aiSelectButton[1].addActionListener(this);
        add(aiSelectButton[1]);
    }

    public void createThemeSelectButtons(){
        ClassicTheme classicTheme = new ClassicTheme(themeName[0], dimension,maze);
        add(classicTheme);
        ForestTheme forestTheme = new ForestTheme(themeName[1], dimension,maze);
        add(forestTheme);
        HighContrastTheme highContrastTheme = new HighContrastTheme(themeName[2], dimension,maze);
        add(highContrastTheme);
    }

    public void createStatusBar(){
        status = new JLabel("Status");
        status.setPreferredSize(new Dimension(355,30));
        add(status);
    }

    public void makeLayoutVisible(){  // All window formats here
        setLayout(new FlowLayout());
        setVisible(true);
        setBounds(600,50,400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Methods for maze

    public void startMaze(){
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                maze[i][j].setText("Click");
                maze[i][j].setEnabled(true);
            }
        }
    }

    public void stopMaze(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maze[i][j].setEnabled(false);
            }
        }
    }

    public void updateMazeText(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                mazeText[i][j] = maze[i][j].getText();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton response = (JButton) e.getSource();
        if(response.getText().equals("Start With Random AI")){
            playingAI = new RandomAI();
            aiSelectButton[0].setEnabled(false);
            aiSelectButton[1].setEnabled(false);
            startMaze();
        } else if(response.getText().equals("Start With Defensive AI")){
            playingAI = new DefensiveAI();
            aiSelectButton[0].setEnabled(false);
            aiSelectButton[1].setEnabled(false);
            startMaze();
        } else {
            player.playerMoves(e,maze);
            updateMazeText();
            if(decider.checkEnded(mazeText)){
             winner = decider.getWinner(mazeText);
             status.setText("Status: " + decider.returnWinner(winner));
            } else{
                aiMoves = playingAI.makeMove(mazeText);
                status.setText("Status: Keep playing");
                maze[aiMoves[0]][aiMoves[1]].setText("0");
                maze[aiMoves[0]][aiMoves[1]].setEnabled(false);
            }

            updateMazeText();
            if(decider.checkEnded(mazeText)){
                stopMaze();
                winner = decider.getWinner(mazeText);
                status.setText("Status: " + decider.returnWinner(winner));
            }
            }
        }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForestTheme extends Theme implements ActionListener {

    String fruit = "\uD83C\uDF53";
    String flower = "\uD83C\uDF3C";

    ForestTheme(String text, Dimension dimension, JButton[][] maze){
        super(text,dimension,maze);
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        toggleTheme();
    }

    public void toggleTheme(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maze[i][j].setBackground(Color.GREEN);
                maze[i][j].setForeground(Color.WHITE);
                if(maze[i][j].getText().equals("X"))
                    maze[i][j].setText(flower);
                else if(maze[i][j].getText().equals("0"))
                    maze[i][j].setText(fruit);
            }
        }
    }
}
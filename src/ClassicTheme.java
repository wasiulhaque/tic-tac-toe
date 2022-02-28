import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassicTheme extends Theme implements ActionListener {

    ClassicTheme(String text,Dimension dimension, JButton[][] maze){
        super(text,dimension, maze);
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
            toggleTheme();
    }

    public void toggleTheme(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                maze[i][j].setBackground(Color.CYAN);
                maze[i][j].setForeground(Color.WHITE);
            }
        }
    }
}

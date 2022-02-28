import javax.swing.*;
import java.awt.*;

public abstract class Theme extends JButton{
    JButton[][] maze;
    Theme(String text, Dimension dimension, JButton[][] maze){
        super(text);
        this.maze = maze;
    }

    void toggleTheme(){
    };
}

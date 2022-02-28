import javax.swing.*;
import java.awt.event.ActionEvent;

public class Player {
    public void playerMoves (ActionEvent e, JButton[][] maze){
        JButton response;
        response = (JButton)e.getSource(); 
        response.setText("X");
        response.setEnabled(false);
    }
}

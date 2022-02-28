import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controls extends JButton implements ActionListener {
    JButton[][] button;
    JButton[] aiButton;
    JLabel status;
    Controls(String text, Dimension dimension, JButton[][] button, JButton[] aiButton, JLabel status){
        super(text);
        setPreferredSize(dimension);
        addActionListener(this);
        this.button = button;
        this.aiButton = aiButton;
        this.status = status;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aiButton[0].setEnabled(true);
        aiButton[1].setEnabled(true);
        terminateButtons();
    }

    public void terminateButtons(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                button[i][j].setText("Click");
                button[i][j].setEnabled(false);
            }
        }
    }
}

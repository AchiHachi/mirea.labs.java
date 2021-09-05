package lab4.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private int madrid;
    private int milan;

    private JButton but1 = new JButton("AC Milan");
    private JButton but2 = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + milan + " X " + madrid);
    private JLabel score = new JLabel("Last Scorer: ");
    private Label winner = new Label("Winner: ");
    private JPanel labels = new JPanel(new GridLayout(1,2));
    private JPanel buttons = new JPanel(new GridLayout(1,3));


    public SimpleGUI(){
        super("lab4");
        this.setSize(450, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labels.add(result);
        labels.add(score);

        buttons.add(but1);
        buttons.add(but2);

        Container container = getContentPane();
        container.add(labels, BorderLayout.SOUTH);
        container.add(buttons, BorderLayout.CENTER);

        ActionListener actionListenerFir = new GoalFromMilan();
        ActionListener actionListenerSec = new GoalFromMadrid();
        but1.addActionListener(actionListenerFir);
        but2.addActionListener(actionListenerSec);
    }

    public void Winner(){
        if(milan - madrid == 3){
            JOptionPane.showMessageDialog(this, "Winner: AC Milan", "Game over!", JOptionPane.DEFAULT_OPTION);
            but1.setEnabled(false);
            but2.setEnabled(false);
        }
        else if (madrid - milan == 3){
            JOptionPane.showMessageDialog(this, "Winner: Real Madrid", "Game Over", JOptionPane.DEFAULT_OPTION);
            but1.setEnabled(false);
            but2.setEnabled(false);
        }
    }

    public class GoalFromMilan implements ActionListener {
        public void actionPerformed(ActionEvent e){
            milan++;
            result.setText("Result :" + milan + " X " + madrid);
            score.setText("Last scorer: " + "AC Milan");
            Winner();
        }
    }

    public class GoalFromMadrid implements ActionListener {
        public void actionPerformed(ActionEvent e){
            madrid++;
            result.setText("Result :" + milan + " X " + madrid);
            score.setText("Last scorer: " + "Real Madrid");
            Winner();
        }
    }

}

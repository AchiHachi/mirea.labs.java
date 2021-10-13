package task6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class GameClass extends JFrame{
    private JButton checkNumber = new JButton("SUBMIT");
    private JFormattedTextField enterNumber = new JFormattedTextField();
    private ClassLoader loadRes = this.getClass().getClassLoader();
    private Image background;

    private int life = 3;

    GameClass() {
        int digit = (int) (Math.random() * 20);

        this.setSize(310, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Game!");
        this.add(checkNumber, BorderLayout.SOUTH);
        this.add(enterNumber, BorderLayout.NORTH);

        try {
            background = ImageIO.read(loadRes.getResource("image\\bg.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        checkNumber.addActionListener((ActionEvent e) -> {
            if (life != 1) {
                try {
                    if (Integer.parseInt(enterNumber.getText()) < digit) {
                        life--;
                        JOptionPane.showMessageDialog(this, "WRONG! DIGIT" +
                                " IS LARGER. YOU HAVE " + life + " LIFE.");
                    } else if (Integer.parseInt(enterNumber.getText()) > digit) {
                        life--;
                        JOptionPane.showMessageDialog(this, "WRONG! DIGIT" +
                                " IS SMALLER. YOU HAVE " + life + " LIFE.");
                    } else if (Integer.parseInt(enterNumber.getText()) == digit) {
                        JOptionPane.showMessageDialog(this, "YOU WIN!");
                        System.exit(0);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "YOU SHOULD " +
                            "ENTER THE NUMBER");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "YOU LOSE!");
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        graphics.drawImage(background,5,50,this);
    }

}

package shootingaliens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel {

    public WelcomePanel(JButton but) {

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 300));
        add(but);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        String msg = "Space Shooter";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics fm = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (400 - fm.stringWidth(msg)) / 2,
                300 / 2);
        
        Toolkit.getDefaultToolkit().sync();

    }

}

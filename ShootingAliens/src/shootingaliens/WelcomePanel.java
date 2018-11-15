package shootingaliens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel {

    public WelcomePanel() {

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300, 200));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        String msg = "Space Shooter";
        Font small = new Font("Helvetica", Font.BOLD, 25);
        FontMetrics fm = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (300 - fm.stringWidth(msg)) / 2,
                200 / 2);
        
        Toolkit.getDefaultToolkit().sync();

    }

}

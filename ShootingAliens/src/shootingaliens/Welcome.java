package shootingaliens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Welcome extends JFrame implements ActionListener {

    CollisionEx ex;
    JButton but;
    Timer timer;

    public Welcome() {

        ex = new CollisionEx(this,timer);

        initUI();
    }

    private void initUI() {

        but = new JButton("Start the game!");
        but.setSize(80, 40);
        but.setBackground(Color.white);
        but.addActionListener(this);
        setTitle("Shooting game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 300));
        setVisible(true);

        timer = new Timer(15, this);
        
        
        add(new WelcomePanel(but));

        setResizable(false);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but) {
            this.setVisible(false);
            ex.setVisible(true);
            timer.start();
        }

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Welcome start = new Welcome();
            start.setVisible(true);
        });

    }

}

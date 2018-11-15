package shootingaliens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome extends JFrame implements ActionListener {

    CollisionEx ex;
    JButton but;


    public Welcome() {

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
        
        add(new WelcomePanel(but));

        setResizable(false);
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but) {
            ex = new CollisionEx(this);
            this.setVisible(false);
            ex.setVisible(true);
        }

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Welcome start = new Welcome();
            start.setVisible(true);
        });

    }

}

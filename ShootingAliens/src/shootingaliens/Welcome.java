package shootingaliens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Welcome extends JFrame implements ActionListener {

    CollisionEx ex;
    JButton but;


    public Welcome() {

        initUI();
    }

    private void initUI() {
        setLayout(new FlowLayout());
        but = new JButton();
        but.setBackground(Color.black);
        but.setBorder(null);
        but.setIcon(new ImageIcon("src/resources/Start.png"));
        but.addActionListener(this);
        
        JPanel back=new JPanel();
        back.setBackground(Color.BLACK);
        back.setPreferredSize(new Dimension(400,300));
        back.setLayout(new FlowLayout());
        
        
        setTitle("Shooting game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 300));
        setVisible(true);   
        back.add(new WelcomePanel());
        back.add(but,BorderLayout.SOUTH);
        add(back);
       
       
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

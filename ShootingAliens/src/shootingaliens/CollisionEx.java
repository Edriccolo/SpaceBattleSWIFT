package shootingaliens;

import javax.swing.JFrame;

public class CollisionEx extends JFrame {

    Welcome ex;

    public CollisionEx(Welcome e) {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Shooting game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
    }
}
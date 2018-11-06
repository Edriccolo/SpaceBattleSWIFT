package shootingaliens;

import javax.swing.JFrame;
import javax.swing.Timer;

public class CollisionEx extends JFrame {

    Welcome ex;
    Timer t;

    public CollisionEx(Welcome e,Timer t) {
        this.t=t;
        initUI();
    }

    private void initUI() {

        add(new Board(t));

        setResizable(false);
        pack();

        setTitle("Shooting game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
    }
}
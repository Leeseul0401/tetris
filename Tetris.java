
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Tetris extends JFrame {
    private JLabel topLbl;
    private JButton btnStart;

    private void init() {
        setSize(550, 800);
        setLocation(100, 100);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
    }

    public Tetris() {
        init();
    }

    public static void main(String[] args) {
        new Tetris();
    }
}

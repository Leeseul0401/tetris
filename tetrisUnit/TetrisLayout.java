package tetrisUnit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TetrisLayout extends JFrame {
	
	private TetrisField gameField;
	
	private JPanel base;
	private JLabel lblNorth;
	
	public TetrisLayout() {
		showFrame();
		init();
		setDisplay();
	}
	
	private void init() {
		Font font = new Font("Fixedsys 보통", Font.BOLD, 40);
		lblNorth = new JLabel("Tetris", JLabel.CENTER);
		// background 할때만 setOpaque 씀?
		//lblNorth.setOpaque(true);
		lblNorth.setForeground(Color.WHITE);
		lblNorth.setFont(font);
		
		JPanel pnlWest = new JPanel();
		pnlWest.setBackground(Color.BLACK);
		pnlWest.setBorder(new LineBorder(Color.WHITE, 3));
		
//		JPanel pnlMain = new JPanel(new BorderLayout());
//		pnlMain.add(pnlWest, BorderLayout.WEST);
//		pnlMain.setBackground(Color.BLACK);
//		
//		add(pnlMain, BorderLayout.CENTER);
		
	}
	
	private void setDisplay() {
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(lblNorth);
		pnlNorth.setBackground(Color.BLACK);
		
		// gameField = new TetrisField();
		JPanel pnlWest = new JPanel();
		pnlWest.setBackground(Color.BLACK);
		pnlWest.setBorder(new LineBorder(Color.WHITE, 3));
		pnlWest.setSize(400, 300);
		
		setVisible(true);
		add(pnlNorth, BorderLayout.NORTH);
		add(pnlWest, BorderLayout.WEST);
	}

	private void showFrame() {
		setTitle("tetris");
		setSize(550, 750);
		setLocation(500, 50);
//		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new TetrisLayout();
	}
}

package days14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JButtonEvent extends JFrame {
	JLabel result;

	JButtonEvent() {
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon usa = new ImageIcon("images/usa.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		// 버튼 이름과 이미지 아이콘으로 버튼 생성
		JButton event = new JButton(korea); // 코리아 이미지 아이콘 버튼 생성
		result = new JLabel("");
		event.setRolloverIcon(usa);
		event.setPressedIcon(germany);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(event);
		setTitle("버튼 자체 이벤트 처리 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}

public class Swing_05 {
	public static void main(String[] args) {
		new JButtonEvent();
	}
	

}

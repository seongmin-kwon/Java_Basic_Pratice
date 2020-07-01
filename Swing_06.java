package days14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//배치 관리자
class JFlowLayout extends JFrame {
	JFlowLayout() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 10));
		// 50: 컨트롤까지의 가로 방향 간격
		// 10: 컨트롤끼리의 세로 방향 간격
		// flowLayout.RIGHT : 정렬방식
		for (int i = 1; i <= 15; i++) {
//			JButton k =new JButton("버튼"+ i);
//			con.add(k);
			con.add(new JButton("버튼" + i));
			setTitle("배치 관리자 실습");
			setSize(500, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);

		}
	}
}

public class Swing_06 {
	public static void main(String[] args) {
		new JFlowLayout();

	}
}

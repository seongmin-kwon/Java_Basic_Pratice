package days14;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class JBorderLayout extends JFrame{
	JBorderLayout(){
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10,10));
		//각 지역 동서남북 중앙 간의 간격 세로 10px
		JButton b1 = new JButton("동쪽 버튼");
		con.add(b1,BorderLayout.EAST);
		JButton b2 = new JButton("서쪽 버튼");
		con.add(b2,BorderLayout.WEST);
		JButton b3 = new JButton("남쪽 버튼");
		con.add(b3,BorderLayout.SOUTH);
		JButton b4 = new JButton("북쪽 버튼");
		con.add(b4,BorderLayout.NORTH);
		JButton b5 = new JButton("중앙 버튼");
		con.add(b5,BorderLayout.CENTER);
		//Center 은 정의하지않으면 자리가 남자만 이외의 영역은 정의 하지 않으면 다른 영역으로 포함되어져 표시
		
		setTitle("보더레이아웃 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Swing_07 {
	public static void main(String[] args) {
		new JBorderLayout();
	}

}

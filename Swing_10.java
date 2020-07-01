package days14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener{
	JTextField jtf;
	JTextFieldTest() {
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		 jtf = new JTextField(50);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(jtf);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		setTitle("텍스트 필드 테스트");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = jtf.getText() + e.getActionCommand();
		jtf.setText(s);
		
	}
}

public class Swing_10 {
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}

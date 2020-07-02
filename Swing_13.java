package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class JTextFieldTextArea extends JFrame implements ActionListener{
	JTextField jtf;
	JTextArea jta ;
	
	JTextFieldTextArea(){
		 jtf = new JTextField(10); //최대 표시 10글자(가로크기)...텍스트 필드
		 jta = new JTextArea(7,20);//7행 20열 (20글자)
		
		//폰트 
				Font f = new Font("나눔고딕",Font.BOLD,25);
				jtf.setFont(f);
				jta.setFont(f);
				JButton k = new JButton("확인");
				
				Container con =getContentPane();
				con.setLayout(new FlowLayout());
				k.addActionListener(this);// 버튼이 눌렸을때!
				con.add(jtf);
				con.add(jta);
				con.add(k);
				
				setTitle("텍스트 필드 텍스트 영역 실습");
				setSize(350, 300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = jtf.getText();
		jta.append(s+"\n");
		jtf.setText("");
		
		
		
	}
}
public class Swing_13 {
	public static void main(String[] args) {
		new JTextFieldTextArea();
	}
}

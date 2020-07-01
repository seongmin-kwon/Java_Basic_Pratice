package days14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calculator extends JFrame implements ActionListener {
	JTextField jt;
	int num1=0;
	int num2=0;
	int op=0;
	
	Calculator() {
		
		
		// 컨테이너의 레이아웃 : 5행 1열의 GridLayout
		// 1행에는 panel p1 배치 -> p1에는 FlowLayout 으로 TextField 한개 배치
		// 2행에는 panel p2 배치 -> p2에는 GridLayout 으로 버튼 4개(7 8 9 +)
		// 3행에는 panel p3 배치 -> p3에는 GridLayout 으로 버튼 4개(4 5 6 -)
		// 4행에는 panel p4 배치 -> p4에는 GridLayout 으로 버튼 4개(1 2 3 x)
		// 5행에는 panel p5 배치 -> p5에는 GridLayout 으로 버튼 4개(C 0 = ÷)

		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 1));//5행1열 텍스트 + 숫자 덩이 4개

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		jt = new JTextField(16);
		p1.add(jt);
		con.add(p1);
		
		//폰트 
		Font f = new Font("나눔고딕",Font.BOLD,25);
		jt.setFont(f);
		jt.setText("0");
		jt.setHorizontalAlignment(SwingConstants.RIGHT);//오른정렬
		jt.setEditable(false);//마우스,키보드 편집 할수없음 설정
		
	
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 4));
		JButton b7 = new JButton("7");
		p2.add(b7);
		JButton b8 = new JButton("8");
		p2.add(b8);
		JButton b9 = new JButton("9");
		p2.add(b9);
		JButton b11 = new JButton("+");
		p2.add(b11);
		con.add(p2);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 4));
		JButton b4 = new JButton("4");
		p3.add(b4);
		JButton b5 = new JButton("5");
		p3.add(b5);
		JButton b6 = new JButton("6");
		p3.add(b6);
		JButton b12 = new JButton("-");
		p3.add(b12);
		con.add(p3);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1, 4));
		JButton b1 = new JButton("1");
		p4.add(b1);
		JButton b2 = new JButton("2");
		p4.add(b2);
		JButton b3 = new JButton("3");
		p4.add(b3);
		JButton b13 = new JButton("x");
		p4.add(b13);
		con.add(p4);
		
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(1, 4));
		JButton b15 = new JButton("C");
		p5.add(b15);
		JButton b0 = new JButton("0");
		p5.add(b0);
		JButton b16 = new JButton("=");
		p5.add(b16);
		JButton b14 = new JButton("÷");
		p5.add(b14);
		con.add(p5);
		
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(1,4));
		JButton b17 = new JButton("<-");
		p6.add(b17);
		con.add(p6);
		
		
		JButton b18 = new JButton("1/x");
		b18.addActionListener(this);
		p6.add(b18);
		b18.setFont(f);
		
		JButton b19 = new JButton("Sqr");
		b19.addActionListener(this);
		p6.add(b19);
		b19.setFont(f);

		JButton b20 = new JButton("%");
		b20.addActionListener(this);
		p6.add(b20);
		b20.setFont(f);

		setTitle("계산기 실습");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		 //버튼 폰트적용
			b1.setFont(f);
			b2.setFont(f);
			b3.setFont(f);
			b4.setFont(f);
			b5.setFont(f);
			b6.setFont(f);
			b7.setFont(f);
			b8.setFont(f);
			b9.setFont(f);
			b0.setFont(f);
			b11.setFont(f);
			b12.setFont(f);
			b13.setFont(f);
			b14.setFont(f);
			b15.setFont(f);
			b16.setFont(f);
			b17.setFont(f);
			//버튼 호출 
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b0.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			b14.addActionListener(this);
			b15.addActionListener(this);
			b16.addActionListener(this);
			b17.addActionListener(this);
			
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s =e.getActionCommand();
		switch(s) {
		case"0":case"1":case"2":case"3":
		case"4":case"5":case"6":
		case"7":case"8":case"9":
			if(jt.getText().equals("0")) {jt.setText("");}
			jt.setText(jt.getText() +s);
			break;
		case "C":
			jt.setText("0"); break;
		case "+":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 1;
			break;
		case "-":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 2;
			break;
		case "x":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 3;
			break;
		case "÷":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 4;
			break;
		case "1/x":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 5;
			break;
		case "Sqr":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 6;
			break;
		case "%":
			num1 = Integer.parseInt(jt.getText());
			jt.setText("0");
			op = 7;
			break;
		case "=":
			int result =0;
			double resultd=0.0;
			num2=Integer.parseInt(jt.getText());
			switch(op) {
			case 1:result=num1 + num2; break;
			case 2:result=num1 - num2;break;
			case 3:result=num1 * num2; break;
			case 4:resultd=num1 / (double)num2; break;
			case 5:resultd=num1 * 0.1; break;
			case 6:resultd=Math.sqrt(num1); break;
			case 7:resultd=num1 %(double) num2; break;
			}
			if(result !=0)jt.setText(String.valueOf(result));
			else jt.setText(String.valueOf(resultd));
			break;
		case "<-":
			if(jt.getText().length() ==1) jt.setText("0");
			else {
				String t = jt.getText();
				jt.setText(t.substring(0,t.length()-1));
			}
			break;
			
		}
	}
}

public class Swing_12 {
	public static void main(String[] args) {
		new Calculator();

	}
}

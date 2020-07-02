package days15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener {
	JTextField y;
	JComboBox<String> m;
	static int year = 0;
	static int month = 0;
	static JTextField[] jt = new JTextField[42];

	Calendars() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		jp1.setLayout(new GridLayout(1, 7));
		jp2.setLayout(new GridLayout(6, 7));
		jp3.setLayout(new GridLayout());

		jp1.add(new JButton("일")).setForeground(Color.RED);
		jp1.add(new JButton("월")).setForeground(Color.green);
		jp1.add(new JButton("화")).setForeground(Color.pink);
		jp1.add(new JButton("수")).setForeground(Color.YELLOW);
		jp1.add(new JButton("목")).setForeground(Color.BLUE);
		jp1.add(new JButton("금")).setForeground(Color.DARK_GRAY);
		jp1.add(new JButton("토")).setForeground(Color.RED);

		Font f = new Font("나눔고딕", Font.BOLD, 20);
		for (int i = 0; i < jt.length; i++) {
			jt[i] = new JTextField();
			jt[i].setFont(f);
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT);
			jt[i].setEditable(false);
			jt[i].setBackground(Color.white);
			//jt[i].setText(String.valueOf(i));
			jp2.add(jt[i]);
			if (i % 7 == 6)jt[i].setForeground(Color.BLUE);
			else if (i % 7 == 0)jt[i].setForeground(Color.RED);
			else jt[i].setForeground(Color.BLACK);
		}

		y = new JTextField(8);
		y.setFont(f);
		y.setHorizontalAlignment(SwingConstants.CENTER);
		Calendar today = Calendar.getInstance();
		y.setText(String.valueOf(today.get(Calendar.YEAR)));
		m = new JComboBox<String>();
		for (int i = 1; i <= 12; i++) {
			m.addItem(String.valueOf(i));
			m.setSelectedIndex(today.get(Calendar.MONTH));
			m.setFont(f);

			con.add(jp1, BorderLayout.NORTH);
			con.add(jp2, BorderLayout.CENTER);
			con.add(jp3, BorderLayout.SOUTH);

			JButton b = new JButton("확인");
			JButton b1 = new JButton("이전달");
			JButton b2 = new JButton("다음달");
			b.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);

			jp3.add(b1);
			jp3.add(y);
			jp3.add(new JLabel("년"));
			jp3.add(m);
			jp3.add(new JLabel("월"));
			jp3.add(b);
			jp3.add(b2);
	
		setTitle("스윙 켈린더");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		year = Integer.parseInt(y.getText());
	    month = Integer.parseInt((String)m.getSelectedItem());
	    drawCalendar();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); // 버튼이 확인인지 이전 , 다음달인지 확인
		Calendar temp = Calendar.getInstance();
		temp.set(year, month - 1, 1);
		switch (s) {
		case "확인":
			year = Integer.parseInt(y.getText());
			month = Integer.parseInt((String) m.getSelectedItem());
			break;
		case "이전달":
			temp.add(Calendar.MONTH, -1);
			year = temp.get(Calendar.YEAR);
			month = temp.get((Calendar.MONTH) + 1);
			y.setText(String.valueOf(year));
			m.setSelectedIndex(month - 1);
			break;
		case "다음달":
			temp.add(Calendar.MONTH, 1);
			year = temp.get(Calendar.YEAR);
			month = temp.get((Calendar.MONTH) + 1);
			y.setText(String.valueOf(year));
			m.setSelectedIndex(month - 1);
			break;
		}
		for(int i=0; i<jt.length;i++)jt[i].setText("");
		drawCalendar();
	}

	public static void drawCalendar() {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		int END_WEEK = eDay.get(Calendar.DAY_OF_WEEK);
		sDay.add(Calendar.DATE, -1 * (START_WEEK - 1));
		eDay.add(Calendar.DATE, 7 - END_WEEK);
		for (int i = 0; sDay.before(eDay) || sDay.equals(eDay); sDay.add((Calendar.DATE), 1)) {
			int day = sDay.get(Calendar.DATE);
			jt[i].setText(String.valueOf(day));
			i++;
		}
	}

}

public class Swing_Calendar {
	public static void main(String[] args) {
		new Calendars();
	}
}

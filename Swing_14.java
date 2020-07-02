package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBoxTest extends JFrame implements ItemListener{
	//ItemListener 체크박스용
	JTextField jtf;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	JCheckBoxTest(){
		jcb1 =new JCheckBox("jsp");
		jcb2 =new JCheckBox("php");
		jcb3 =new JCheckBox("asp");
		jcb4 =new JCheckBox("servelet");
		jtf =new JTextField(30);
		
		Container con =getContentPane();
		con.setLayout(new FlowLayout());
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		con.add(jtf);
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		
		setTitle("체크박스 실습");
		setSize(800, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox ch =(JCheckBox)e.getItem();
		String s;
		s ="";
		
		if(jcb1.isSelected())s = s+"JSP ";
		if(jcb2.isSelected())s = s+jcb2.getActionCommand() +" ";
		if(jcb3.isSelected())s = s+"ASP ";
		if(jcb4.isSelected())s = s+jcb4.getActionCommand() +" ";
		jtf.setText("현재 선택 항목:" +s);
	}
}

public class Swing_14 {
	public static void main(String[] args) {
		new JCheckBoxTest();
	}
}

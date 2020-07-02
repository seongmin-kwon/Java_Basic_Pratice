package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Resume extends JFrame implements ActionListener {
	JTextField jtf;
	 JTextField jt_name;
	 JRadioButton jr1,jr2;
	 JCheckBox jc1;
	 JCheckBox jc2;
	 JCheckBox jc3;
	 JCheckBox jc4;
	 JComboBox<String> jcb;
	 JTextField jt_phone2;
	 JTextField jt_phone3;
	 JComboBox<String> jcb2;

	Resume(){
			Container con = getContentPane();
			con.setLayout(new GridLayout(6, 1));
			
			
			JLabel name =new JLabel("성     명 : ");
			JPanel p1 = new JPanel();
			p1.setLayout(new FlowLayout(FlowLayout.LEFT));
			jt_name = new JTextField(15);
			p1.add(name);
			p1.add(jt_name);
			con.add(p1);
			
			JPanel p2 = new JPanel();
			JLabel gender =new JLabel("성     별 : ");
			p2.setLayout(new FlowLayout(FlowLayout.LEFT));
			jr1 =new JRadioButton("남성");
			jr2 =new JRadioButton("여성");
			p2.add(gender);
			p2.add(jr1);
			p2.add(jr2);
			con.add(p2);
			
			JPanel p3 = new JPanel();
			JLabel hobby =new JLabel("취     미 : ");
			p3.setLayout(new FlowLayout(FlowLayout.LEFT));
			jc1 = new JCheckBox("스포츠");
			jc2 = new JCheckBox("영화");
			jc3 = new JCheckBox("독서");
			jc4 = new JCheckBox("기타");
			p3.add(hobby);
			p3.add(jc1);
			p3.add(jc2);
			p3.add(jc3);
			p3.add(jc4);
			con.add(p3);
			
			
			JPanel p4 = new JPanel();
			JLabel pnum =new JLabel("전 화 번 호  : ");
			JLabel bnum = new JLabel(" - ");
			JLabel bnum1 = new JLabel(" - ");
			
			jcb=new JComboBox<String>();
			jcb.addItem("010");
			jcb.addItem("011");
			jcb.addItem("02");
			jcb.addItem("032");
			jcb.addItem("031");
			
			p4.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			jt_phone2= new JTextField(10);
			jt_phone3= new JTextField(10);
			
			p4.add(pnum);
			p4.add(jcb);
			p4.add(bnum1);
			p4.add(jt_phone2);
			p4.add(bnum);
			p4.add(jt_phone3);
			con.add(p4);
			
			JPanel p5 = new JPanel();
			JLabel loc =new JLabel(" 거 주 지 역  : ");
		jcb2 = new JComboBox<String>();
		jcb2.addItem("서울");
		jcb2.addItem("강원도");
		jcb2.addItem("경상도");
		jcb2.addItem("제주도");
		jcb2.addItem("경기도");
		jcb2.addItem("충청도");
		jcb2.addItem("전라도");
			p5.setLayout(new FlowLayout(FlowLayout.LEFT));
			p5.add(loc);
			p5.add(jcb2);
			con.add(p5);
			
			JPanel p6 = new JPanel();
			JButton jb =new JButton("확인");
			jb.addActionListener(this);
			
			
			
			p6.setLayout(new FlowLayout(FlowLayout.CENTER));
			p6.add(jb);
			con.add(p6);
			setTitle("이력서 실습 총정리");
			setSize(500,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("성명:" +jt_name.getText());
		if(jr1.isSelected()) s ="남성";
		else s ="여성";
		System.out.println("성별"+s);
		
		s="";
		if(jc1.isSelected())s =s+jc1.getText()+ " ";
		if(jc2.isSelected())s =s+jc2.getText()+ " ";
		if(jc3.isSelected())s =s+jc3.getText()+ " ";
		if(jc4.isSelected())s =s+jc4.getText()+ " ";
		System.out.println("취미:"+s);
		
		s = (String) jcb.getSelectedItem();
		s= s+"-"+jt_phone2.getText();
		s= s+"-"+jt_phone3.getText();
		
		System.out.println("전화번호:"+s);
		System.out.println("거주지역:"+jcb2.getSelectedItem());
	}
	
}
public class Swing_17 {
	public static void main(String[] args) {
		new Resume();
	}
}

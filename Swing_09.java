package days14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//이미지 apple.jpg persimmon.jpg  pear.jpg  banana.jpg cherry.jpg
//여섯개의 이미지를 아이콘으로 만들고 버튼 여섯개를 이미지와 함께 생성
//액션 리스터 를 붙혀서 버튼 클릭시에 이미지에 해당하는 과일 이름이 result라벨에 나오도록 작성하시오.
class GridFruts extends JFrame implements ActionListener {
	JLabel result;

	GridFruts() {

		ImageIcon apple1 = new ImageIcon("images/apple.jpg");
		ImageIcon persimmon1 = new ImageIcon("images/persimmon.jpg");
		ImageIcon banana1 = new ImageIcon("images/banana.jpg");
		ImageIcon pear1 = new ImageIcon("images/pear.jpg");
		ImageIcon cherry1 = new ImageIcon("images/cherry.jpg");

		// 버튼 이름과 이미지 아이콘으로 버튼 생성
		JButton apple = new JButton("사과",apple1);
		JButton persimmon = new JButton("감",persimmon1);
		JButton banana = new JButton("바나나",banana1);
		JButton pear = new JButton("배",pear1);
		JButton cherry = new JButton("체리",cherry1);

		result = new JLabel("");

		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(apple);
		con.add(persimmon);
		con.add(banana);
		con.add(pear);
		con.add(cherry);
		con.add(result);

		cherry.addActionListener(this);
		apple.addActionListener(this);
		pear.addActionListener(this);
		persimmon.addActionListener(this);
		banana.addActionListener(this);

		setTitle("과일 버튼 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand(); // 클릭된 버튼의 표시된 값이 문자 변수 s에 저장됨.
		this.result.setText(s+"를 클릭!");
	}

}

public class Swing_09 {
	public static void main(String[] args) {
		new GridFruts();
		
	}
}

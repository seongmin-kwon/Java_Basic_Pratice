package days14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 *윈도우 프로그래밍에 필요한 윈도우 구성요소를 상속받아 추가기능 탑재 형식의 개발을 진행합니다. 
 * 자바의 JFC(Java Foundation Class)는
 *  GUI 프로그래밍에 필요한 각종 킷을 모아놓은 것으로
 *  현재는 GUI의 기능들을 구현할 수 있는 스윙, 2D, Drag&Drop 등을 지원합니다.
 *  스윙을 사용하는 방법은 AWT와 거의 유사하나 AWT보다는 많은 컴포넌트 및 기능을 지원하고 있습니다.
 *  스윙은 AWT와 달리 자바 프로그래밍으로 자체적인 제작된 컴포넌트이므로 플랫폼에 관계없이 모양이 동일하게 사용할 수 있습니다. 
 *  
 */


class Button_Test extends JFrame{
	Button_Test(){
		JButton male = new JButton("남성"); //남자 버튼
		JButton female = new JButton("여성");//여자 버튼
		JLabel lable =new JLabel("당신의 성별은?"); //안내문구 표시용 컨트롤
		
		Container con =getContentPane();//위의 버튼 라벨등등을 담을 컨테이너 새인스턴스 생성
		//FlowLayout fl = new FlowLayout();
		con.setLayout(new FlowLayout()); //윈도우 프레임에 add되어지는 순서로 한줄로 화면 구성
		//con.setLayout(new FlowLayout());참조변수에 않넣고 한번쓰고 버린다.
		//이제 화면에 올려보자.
		con.add(lable);
		con.add(male);
		con.add(female);
		
		setTitle("버튼 컴퍼넌트 테스트");//윈도우 좌측상단에 표시된 타이틀 내용설정.
		setSize(300,100); //원도우 크기 설정 : 단위 (픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//현재 윈도우 종료시 프로그램까지 종료
		
		setVisible(true); //보이게
		
	}
	
}
public class Swing_01 {
	public static void main(String[] args) {
		//Button_Test bt = new Button_Test(); 궂이 이렇게 변수에 넣고 여러번 사용할 필요없어.
		new Button_Test();
	}
}

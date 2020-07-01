package days10;

import java.util.Scanner;



	class Student1 {
		private int bunho;
		private String name;
		private String[] subjects = { "국어", "영어", "수학" };
		private int[] scores; // 성적을 저장하기 위한 배열 변수
		private int tot; // 총점을 저장하기 위한 변수
		private double avg; // 평균을 저장하기 위한 변수
		private char grade; // 학점을 저장하기 위한 변수
		// 생성자 2개, input, output, copy1, copy2
		// Student(){ }

		Student1(String name) {
			this.name = name;
			scores = new int[subjects.length];
		}

		public void calculate() { // 총점 평균 학점 구하는 메서드
			for (int i = 0; i < subjects.length; i++)
				tot += scores[i];
			avg = (double) tot / subjects.length;
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
		}

		Student1(String name, int score1, int score2, int score3) {
			this(name);
			scores[0] = score1;
			scores[1] = score2;
			scores[2] = score3;
			calculate();
		}

		public void input() {
			Scanner sc = new Scanner(System.in);
			scores = new int[subjects.length]; // 과목의 갯수 만큼 점수배열의 크기결정
			for (int i = 0; i < subjects.length; i++) {
				System.out.printf("%s 과목 점수 : ", subjects[i]); // 과목 이름 안내후 입력
				scores[i] = sc.nextInt();
			}
			calculate();
		}

		public void copy1(Student1 b) {
			this.bunho = b.bunho;
			this.name = b.name;
			for (int i = 0; i < subjects.length; i++)
				this.scores[i] = b.scores[i];
			this.tot = b.tot;
			this.avg = b.avg;
			this.grade = b.grade;
		}

		public Student1 copy2() {
			Student1 t = new Student1("");
			t.bunho = this.bunho;
			t.name = this.name;
			for (int i = 0; i < subjects.length; i++)
				t.scores[i] = this.scores[i];
			t.tot = this.tot;
			t.avg = this.avg;
			t.grade = this.grade;
			return t;
		}

		public void output() {
			System.out.println("-----------------------------");
			System.out.printf("%s 학생의 성적 정보를 출력합니다\n", name);
			System.out.printf("총점 : %d 점, 평균 %.2f 점\n", tot, avg);
			System.out.printf("등급 : %c\n", grade);
			System.out.println("-----------------------------");
		}
	}

	public class Class_16_T {
	 public static void main(String[] args) {
	  Student1 s1 = new Student1("홍길동");
	  s1.input(); // 이름을 홍길동으로 생성후   점수들 입력
	  Student1 s2 = new Student1("홍길서");
	  s2.copy1(s1);  // 객체를 전달인수로 하는 멤버메서드  s1 을 s2 에 복사
	  Student1 s3 = s2.copy2();  // 객체를 리턴값으로 하는 멤버 메서드   s2를 s3에 복사
	  Student1 s4 = new Student1("홍길남", 100, 100, 100); //this(이름) 을 호출하는 생성자
	  s1.output(); // 번호 이름 점수 학점 등등을 화면에 적절히 출력
	  s2.output();
	  s3.output();
	  s4.output();

	 }

	}

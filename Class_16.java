package days10;

import java.util.Scanner;

class Student {
	// 멤버 필드
	private int bunho;
	private String name;
	private String[] subjects = { "국어", "영어", "수학" };
	private int[] scores;
	private int total;
	private double avg;
	private char grade;
	//생성자 2개
	Student(String name) {
		this.name=name;
		scores =new int[subjects.length];
	}
	Student(String name,int kor,int eng, int math) {
		this(name);
		scores[0]=kor;
		scores[1]=eng;
		scores[2]=math;

	}
	// 맴버 메서드
	public void input() {
		scores =new int[subjects.length];
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.printf("국어 점수 입력:");
		this.scores[0]=sc.nextInt();
		System.out.printf("영어 점수 입력:");
		this.scores[1]=sc.nextInt();
		System.out.printf("수학 점수 입력:");
		this.scores[2]=sc.nextInt();
		calculate();
	}

	public void output() {
		calculate();
		System.out.printf("성적표를 출력 합니다.\n");
		System.out.printf("%d %s %d %d %d %d %.1f %c\n",this.bunho,this.name,this.scores[0],this.scores[1],this.scores[2],this.scores[0]+this.scores[1]+this.scores[2],this.scores[0]+this.scores[1]+this.scores[2]/3.0,this.grade);
		

	}
	public void calculate() {
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		if(sum>=10) {
			this.grade='A';
		}

	}

	public void copy1(Student a) {
		this.bunho=a.bunho;
		this.name=a.name;
		this.scores=a.scores;
		this.total=a.total;
		this.avg=a.avg;
		this.grade=a.grade;
			
		}
	
	
	public Student copy2() {
		Student a = new Student(" ");
		a.bunho=this.bunho;
		a.name=this.name;
		a.total=this.total;
		a.avg=this.avg;
		a.grade=this.grade;
		return a;

	}
	// geter() seter()
	public int getBunho() {
		return bunho;
	}
	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}

public class Class_16 {
	public static void main(String[] args) {
		Student s1 = new Student("권성민");
		s1.input();// 이름 권성민, 점수 입력
		Student s2 = new Student("홍길동");
		s2.copy1(s1);// 객체를 전달인수로 하는 멤버 메서드 s1을 s2에 복사
		Student s3 = s2.copy2();// 객체를 리턴 값으로 하는 멤버 메서드 s2를 s3에 복사
		Student s4 = new Student("손흥민", 100, 100, 100);// this(이름)을 호출하는 생성자
		s1.output();// 번호 이름 점수 학점 등을 적절히 출력
		s2.output();
		s3.output();
		s4.output();

	}
}

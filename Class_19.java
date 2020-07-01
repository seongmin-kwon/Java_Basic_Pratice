package days11;


//main 메서드의 객체 생성 new 명령에 맞게 동작하는 생성자 메서드를 완성하세요.
//this() 메서드 호출을 활용하여 제작하세요.

	class Student {
		// 멤버 필드
		static int count =0;
		private int bunho;
		private String name;
		private int [] scores;
		private int kor;
		private int eng;
		private int math;

		public Student() {
			scores=new int [3];
			this.name = "Student";
			//어차피 모든 생성자는 디폴트를 들리도록되있으니 객체가 생길때 마다 카운트값이 늘어난다.
			count ++;
			bunho = count ;
			
		}

		 Student(String name) {
			this(); //전달인수 없는 this메서드는 디폴트 생성자 가서 그내용실행하고온다.
			this.name = name;

		}

		 Student(String name, int kor, int eng, int mat) {
			this(name);// 이러면 생성자중에 2번째 거실행하고옴 중복성 제거 개 좋다.
			this.scores[0]=kor;
			this.scores[1]=eng;
			this.scores[2]=mat;
			
		}// 점수 까지 저장

		  Student (Student s) {
			this(s.name,s.scores[0],s.scores[1],s.scores[2]);

		}
		public void prn() {
			System.out.printf("%d  %s  %d  %d  %d\n",this.bunho,this.name,this.scores[0],this.scores[1],this.scores[2]);
			
		}
	}
	
	public class Class_19 {
		public static void main(String[] args) {
			Student s1 =new Student();
			s1.prn();
			Student s2 =new Student("홍길동");
			s2.prn();
			Student s3 =new Student("홍길동",98,69,87);
			s3.prn();
			Student s4 =new Student(s3);
			s4.prn();
		}

	}
	



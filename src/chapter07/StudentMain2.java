package chapter07;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student stu1 = new Student(); // 1 번 생성자
		Student stu2 = new Student("홍길동"); // 2 번 생성자
		Student stu3 = new Student("홍길동", 4); // 3번 생성자
		Student stu4 = new Student("홍길동", 4, "소프트웨어공학"); // 4번 생성자 

	}

}

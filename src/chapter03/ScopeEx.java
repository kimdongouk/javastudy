package chapter03;

public class ScopeEx { // 클래스 블럭

	int no; // 클래스 블럭 내에서 사용 가능한 변수
	
	public static void main(String[] args) { // main 메서드 블럭

		String name; // main 메서드 블럭 내에서 사용 가능한 변수
		
		if (true) {
			// 메서드 블럭 안에서 선언한 변수 사용 가능
			name = "홍길동";
			
			// if문 블럭안에서 변수 선언
			String email = "hong@test.com";
		}
		
		// if문 블럭 밖에서 email 변수를 사용하면 에러 발생
		email = "hong@test.com";
		
	}

}

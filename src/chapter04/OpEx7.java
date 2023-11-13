package chapter04;

public class OpEx7 {

	public static void main(String[] args) {
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		if (score >=60) {
			pass = "합격";
		} else {
			pass = "불합격";
		}
		System.out.println(pass);

	}

}

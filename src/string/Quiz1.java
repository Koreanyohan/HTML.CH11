//1. 문자열 "a:b:c:d"를 만드세요.

//2. 이 문자열을 "a#b#c#d"로 바꿔서 출력해주세요.


package string;

public class Quiz1 {

	public static void main(String[] args) {
		String str = "a:b:c:d";
		
		System.out.println(str.replace(":","#"));

	}

}

/*
 * 이전 문제를 함수형태로 바꾸고 호출하세요.
 * 
 * ex ) getCharCount ("자바 프로그래밍 입문") -> 9
 * getCharCount ("equals 메소드는 두 객체가 같은지 비교한다") ->21
 * */

package string;

public class Quiz5 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";

		calc(str);

		String str1 = "equals 메소드는 두 객체가 같은지 비교한다";

		calc(str1);

}

	public static void calc(String str) {//함수 선언부 : 반환타입(없으면 void), 함수이름, 매개변수
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				sum = sum + 1;
		}
		System.out.println("공백을 제외한 글자의 갯수 : " + (str.length() - sum));
	}
}

// 해설풀이 -함수의 반환타입을 int로 해서 return 문자열의 숫자로 만듬. 
//이후에 메인함수에서 return된 값을 print함수의 매개변수로 넣어서 출력시킴.

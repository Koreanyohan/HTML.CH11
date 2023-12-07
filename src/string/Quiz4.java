/* * "자바 프로그래밍 입문"이라는 문자열을 만드세요.
 * 
 * 공백을 제외한 글자수만 세어서 출력하세요.
 * 
 * ex) 자바 프로그래밍 입문 : 9 (전체 11 공백 2)
 * */

package string;

public class Quiz4 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍 입문";

		System.out.println(str.indexOf(" "));
		
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sum = sum + 1;
			}
		} 
		System.out.println("공백을 제외한 글자의 갯수 : " + (str.length()-sum));
	}
}

//해설은 str.charAt(i) != ' ' 이라고 해서 그냥 첨부터 공백아닌 글자수를 세버림.
//처음에 System.out.println(charAt(' ');해서 공백문자 위치 찾으려 했지만, 
				//이렇게 하니까 최초의 공백값만 나와서 문제 풀이에 도움이 안됨. 


/*
 * 1. "안녕하세요 저는 둘리입니다." 라는 문자열을 만드세요.
 * 2. 이 문자열에서 "둘리"부분만 추출하세요.
 * */

package string;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 내 풀이 - 둘리인덱스 눈대중으로 봄
		String str = "안녕하세요 저는 둘리입니다.";
		
		System.out.println(str.substring(9,11));
		
		// 해설 풀이
		System.out.println(str.indexOf("둘"));
		System.out.println(str.substring(9,11));
	}

}

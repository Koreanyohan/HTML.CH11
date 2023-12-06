/*
 * 1. 주민번호 뒷자리의 맨 첫번째 숫자는 성별을 나타냅니다.
 * 2. 주민번호를 입력하면 성별을 출력하도록 구현하세요.
 * ex) "881120-1068234" ->  "성별은 남자입니다"
 *     * 1,3 -> 남자         * 2,4 -> 여자
 * */

package string;

public class Quiz3 {

	public static void main(String[] args) {
		String str = "881120-4068234";
		
		System.out.println(str.indexOf("-") +1);// '-' 다음 자리의 인덱스 찾기
		
		char condition = str.charAt(7);
		
		if (condition=='1' || condition=='3') {
			System.out.println("성별은 남자입니다");
		} else if (condition=='2' || condition=='4') {
			System.out.println("성별은 여자입니다.");
		} else
			System.out.println("유효한 주민번호를 입력하세요.");
	}
}

/*
 * 문자를 저장하는 리스틀 생성하고 'a','b','c','d' 를 저장하세요.
 * 
 * 그리고 리스트안에 저장된 모든 문자를 꺼내서 출력하세요.
 * 
 * 오토박싱, 언박싱이 발생한 부분을 찾아서 주석을 달아보세요.
 * */

package wrapper;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {
		ArrayList <Character> list = new ArrayList <Character>();
		
		list.add('a');  // list.add (new Character('a')) 오토박싱
		list.add('b');	// list.add (new Character('b'))
		list.add('c');	// list.add (new Character('c'))
		list.add('d');	// list.add (new Character('d'))
		
//		System.out.println(list.get(0)); 
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		//리스트 안에 저장된 문자를 모두 출력
		for (int i = 0 ; i<list.size() ; i++) {
			char ch = list.get(i); 
	// ㄴ list.get(i).charValue()으로 언박싱 = new Character('a').charValue()
			System.out.println(ch);
		}		
	}
}

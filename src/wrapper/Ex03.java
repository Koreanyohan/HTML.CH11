package wrapper;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
	//new Boolean(true)로 변환됨. (오토박싱) - 잊지마.여기서  ArrayList는 객체만 저장가능.
										// why? 제네릭스 타입변수 클래스만온다
		list.add(true);
		list.add(true);
		list.add(false);
		
		//list.get(0).booleanValue()으로 변환됨. (언박싱)
		boolean b = list.get(0);   // list.get(0)은  new Boolean(true)지
		
		
		
	}

}

//형변환 복습용 문제

// 1. 3번째 예제에서 작성한 Student클래스를 재사용하세요.
// 2. Object형 변수를 선언하고 Student객체를 대입하세요.
// 3. Object형 변수를 사용해서 학번과 이름을 출력하세요.

package object;

public class Quiz2 {

	public static void main(String[] args) {
	
		//object는 모든 클래스의 부모이기때문에 형변환 가능
		Object object = new Student1(1001, "둘리");
		
		if  (object instanceof Student1) {//부모객체의 참조변수 object가 자식객체의 요소 사용위해 다운캐스팅
		Student1 stu = (Student1) object;
		
		stu.id();
		}
	}
}

class Student1 {
	int id; // 학번   
	String name;
	
	void id() {
		System.out.println("학번은" + this.id + "입니다.");		
	}
	
	void name () {
		System.out.println("이름은" + this.name + "입니다.");
	}	
	
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}	
}
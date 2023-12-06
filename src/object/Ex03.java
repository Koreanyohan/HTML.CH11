package object;

public class Ex03 {

	public static void main(String[] args) {
		Student student1 = new Student(20141100, "옆집아저씨");
		Student student2 = new Student(20141100, "고길동");

		if (student1 == student2) { // 참조변수의 주소값 비교
			System.out.println("student1과 student2의 객체의 주소값은 같다");
		} else {
			System.out.println("student1과 student2의 객체의 주소값은 다르다");
		}
		
		if (student1.equals (student2) ) { // 참조변수의 학번 비교
			System.out.println("student1과 student2은 같은학생이다");
		} else {
			System.out.println("student1과 student2은 다른학생이다");
		}
		
				
	}
}

class Student {
	int id; // 학번   
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { // Student클래스의 equals 메서드 재정의 
		// 학생의 학번이 같으면 참, 그렇지 않으면 거짓 반환
		// 나의 학번 == obj의 학번 비교

		if (obj instanceof Student) { // Object 객체는 Student클래스의 요소를 가지고 있지 않음.(부모니까 자식의 요소가 없음. 그래서 obj.id obj.name 따위못함.) 따라서 obj가 Object타입이므로 id참조위해 Student타입으로 형변환.
			Student a = (Student) obj;
			if (this.id == a.id)
				return true; // 클래스 빠져나옴. return이니까.
		}
		return false; // 이상하게 위의 if문에 else return false; 쓰면 틀렸다고 나옴..
	}
}

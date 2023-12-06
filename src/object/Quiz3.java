//1. name과 type을 멤버변수로 가지는 Dog클래스를 만드세요.

//2. 다음과 같이 출력되도록 toString메서드를 재정의하세요.
//	 System.out.println(dog) -> "진돗새 초코"

package object;

public class Quiz3 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("초코", "진돗개");
		System.out.println(dog);
		System.out.println(dog.toString());		
	}
}


class Dog {
	String type ;
	String name ;
	
	public Dog(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}
}


package java_20210429;
// 패키지명도 식별자에 포함 되기 때문에 식별자 규칙을 지켜야 한다. 
// class 명도 식별자에 포함 되기 때문에 식별자 규칙을 지키는 것은 당연하고 관례 또한 지켜야한다. 
// 클래스명 관례
// 1.클래스 이름 작성시 첫 글자는 대문자로 나머지는 모두 소문자로 작성,
// 2.두 단어를 합성 할 때 두 번째 단어의 첫 글자는 대문자 (카멜 표기법, camel case)로 한다.
// 3.상수는 모두 대문자로 한다.
// tab으로 들여쓰는 버릇을 들여라. 


// 색이 바뀐 글자들은 모두 예약어
// main 이 method 이름이다 method명 또한 식별자 이름이다.
// class 명 빼곤 다 소문자 (식별자 중에서 )

public class IdentifierDemo {
	// 매서드명도 식별자에 포함됨
	// 클래스명을 제외한 모든 이름은 소문자로 시작한다.
	// args - arguments(여기에도 식별자 규칙 적용)
	public static void main(String[] args) {
		int age = 20;
		// n은 이름 변수 입니다. 이런식으로 만들지마라 딱 보고 알기도 어렵고 
		// 주석은 애초에 필요한 설명을 위해서 적는 것이지 이런거에 쓰는 게 아니다. 길어도 풀네임 알 수 있게 적어라.
		//String name = "hello" ;
		// 변수 명도 식별자! 주석은 위에 다가 적어야한다.
		// 첫 글자는 숫자를 사용할 수 없음. (아래처럼 하면 Error 난다.)
		// String 1fatherName = : "John"; 
		// 공백을 사용할 수 없음
		// String mother Name = "Michell";
		// 예약을 사용할 수 없음
		// void = "empty";
		 
		// 자바는 유니코드(전세계 모든 나라의언어를 지원하기 위해서 만든 것)를 지원한다. 그래서 변수명에 유니코드에 등록된 언어는 사용할 수 있다.
		// name 대신 한글을 적어도 되지만 위의 이런식으로 적지마라.
		// 특수문자는 무조건 사용 불가 예외를 제외하고 
		// 변수명을 딱 보고 알 수 있게 하고 세련되게 적어라.
		String 이름 = "성영한";
		System.out.println(이름);			
	}

}

import java.io.IOException;

public class FirstSecondExceptionThrowMain {

	public static void main(String[] args) throws IOException {
		System.out.println("1. main 흐름 start");
		First first = new First();
		System.out.println("2. main 흐름 first.method1() 호출전");
		first.method1();
		System.out.println("2. main 흐름 first.method1() 호출후");
		return;
	}

}

package byte_stream.filter_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * PrintStream
		 * 자바의 모든 데이타를 문자로 출력하는 기능(필터)을 하는 스트림
		 */
		
		PrintStream ps = 
				new PrintStream(
						new FileOutputStream("print.txt"));
		ps.write(65); //write메소드는 필터링 안함
		ps.write('A');  
		
		
		ps.print(65);  
		/* ps.print(65);와 같은 작업 (String으로 분류->캐릭터로 나눠서 write -> 있는 그대로 보임=필터링)
			ps.write('6');
			ps.write('5');
		*/
		
		ps.print(true);
		/*
		 * ps.print(true);와 같은 작업: true를 String으로 변경-> 문자열 하나씩 떼서 int로 변경 -> 있는 그대로 보임
		 * ps.write('t');
		 * ps.write('r');
		 * ps.write('u');
		 * ps.write('e');
		 */
		
		ps.print(12345);
		/*ps.write(49); 49는 1의 아스키코드
		ps.write(50);
		ps.write(51);
		ps.write(52);
		ps.write(53);
		*/
		
		ps.flush();
		ps.close();
		
		System.out.println("-------------PrintStream.print()---->print.txt--------------");
		
		
		
	}

}

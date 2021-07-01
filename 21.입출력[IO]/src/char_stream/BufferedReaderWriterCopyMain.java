package char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterCopyMain {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌_LINENO.txt"));

		/*
		 * 
		 */
		String readLine = br.readLine();
		System.out.println("1.readLine:" + readLine);
		readLine = br.readLine();
		System.out.println("2.readLine:" + readLine);
		
		int lineNo = 0;
		while(true) {
			readLine = br.readLine();
			if(readLine == null) {
				break;
			}
			if(readLine.equals("")){
				continue;
			}
			lineNo++;
			bw.write(lineNo+":"+readLine); //라인붙여주는작업
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
		System.out.println("--------BufferedReaderWriter Copy------------");
	}

}
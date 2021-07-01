package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamMain {
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("bufferedOut.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(0b0000001110010);
		bos.write(89);
		bos.write(23);
		for(int i=0;i<256;i++) {
			bos.write(i);
		}
		bos.flush(); //flush메소드: 버퍼가 차지 않은 데이터의 작업
		bos.close();
		System.out.println("BufferedOutputStream.write --> bufferedOut.dat ");
		
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("bufferedOut.dat"));
		
		while(true) {
			int readByte = bis.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);
		}
		bis.close();
		
		System.out.println("BufferInputStream.read <-- bufferedOut.dat");
		
	}
}
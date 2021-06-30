package byte_stream.filter_stream;

import java.io.BufferedOutputStream;
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
		bos.close();
		System.out.println("BufferedOutputStream.write --> bufferedOut.dat ");
		
		
		
		
	}
}
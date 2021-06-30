package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("file_image.jpg"); //빨대(1)
		FileOutputStream fos=new FileOutputStream("file_image_copy.jpg"); //빨대(2)
		int count=0;
		int starCount =0;
		long starTime = System.currentTimeMillis();
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			//System.out.println(Integer.toBinaryString(readByte));
			fos.write(readByte);
			count++;
			
			if(count%1024==0) { 
				System.out.print("★");
					starCount++;
					if(starCount%10 == 0) {
						System.out.println();
				}
			}
			
		}
		long endTime = System.currentTimeMillis();
		fis.close();
		fos.close();
		System.out.println();
		System.out.println(">>> FileCopy:"+count+" bytes copy");
		System.out.println(">>>:"+ (endTime-starTime/1000) +" second");
		
	}

}
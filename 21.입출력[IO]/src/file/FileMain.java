package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) throws Exception{
		/*
		  현재경로[기준경로]
		   eclipse --> C:\2021-05-JAVA-DEVELOPER\eclipse-workspace-se-no-git\21.입출력[IO]
		  상대(relative)경로
		   현재 경로를 기준으로 경로를 기술
		  절대(absolute)경로
			C:,D: 드라이브를 기준으로 경로 기술
		 */
		String str = "김\"경\"호"; //더블쿼테이션?을 이스케이핑?하려고 함...
		File file1 = new File("fileWriter.txt");
		File file2 = new File("sample/데미안.txt");
		File file3 = new File("sample/죄와벌.txt");
		File file4 = new File("C:\\2021-05-JAVA-DEVELOPER\\eclipse-workspace-se-no-git\\21.입출력[IO]\\sample\\데미안[복사].txt");
		System.out.println("----------1.file path-----------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("----------2.file absolute path-----------"); //절대경로
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("----------3.file name-----------");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("----------4.file parent-----------");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
	
		File dir1 = new File("sample");
		File dir2 = new File("sample/subSample1");
		File dir3 = new File("sample","subSample1");
		System.out.println("-------------5.isDirectory,isFile--------------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir1.isFile());
		System.out.println(dir2.isDirectory());
		System.out.println(dir2.isFile());
		System.out.println("------------6.디렉토리안에 파일(디렉토리)의 목록(String[])---------------");
		String[] fileNameList = dir1.list();
		for (String fileName : fileNameList) {
			System.out.println("\t" + fileName);
		}
		System.out.println("------------7.디렉토리안에 파일(디렉토리)의 목록(File[])---------------");
		File[] fileList = dir1.listFiles();
		for (File file : fileList) {
			if(file.isDirectory()) {
				System.out.println("\t D:" + file.getName());
				File[] subFileList = file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t\t" + subFile.getName());
				}
			}else if(file.isFile()) {
				System.out.println("\t F:" + file.getName());
			}
		}
		
		System.out.println("---------8.root directory 파일 목록------------");
		File[] rootDriveFileList = File.listRoots();
		for (File rootfile : rootDriveFileList) {
			System.out.println(rootfile.getPath());
		}
		System.out.println("------------C:\\ 파일목록----------");
		File[] cDriveFileList =  rootDriveFileList[0].listFiles();
		for (File cDriveFile : cDriveFileList) {
			System.out.println(cDriveFile.getName());
		}
		System.out.println("-----------9.directory생성---------------");
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2");
		File newDir3 = new File("sample", "subSample3");
		System.out.println("newDir1의 존재여부:" + newDir1.exists());
		System.out.println("newDir1의 생성:" + newDir1.mkdir()); //한 번 만들어지면 다시 만들어지지x
		System.out.println("newDir2의 생성:" + newDir2.mkdir());
		System.out.println("newDir3의 생성:" + newDir3.mkdir());
		System.out.println("---------10.directory이름변경--------------");
		newDir2.renameTo(new File("renameDir2"));
		System.out.println("---------11.directory삭제--------------");
		System.out.println("newDir3의 삭제:" + newDir3.delete());
		
		System.out.println("--------------<<<<<<File생성,삭제,이름변경>>>>>>--------------");
		File newFile1 = new File("newDir1", "newFile1.txt");
		File newFile2 = new File("newDir1", "newFile2.txt");
		System.out.println("newFile1생성:" + newFile1.createNewFile());
		System.out.println("newFile2생성:" + newFile2.createNewFile());
		System.out.println("newFile1 이름변경:" + newFile1.renameTo(new File("newDir1","renameNewFile2.txt")));
		System.out.println("newFile1 삭제" + newFile1.delete());
		//System.out.println("newFile1 삭제" + newFile1.deleteOnExit(););
		
		
	}

}

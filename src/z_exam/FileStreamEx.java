package z_exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class FileStreamEx {
	// protected를 앞에 붙이면 상속, 같은패키지에서 같은 생성자를 생성하는 것을 허용
	public FileStreamEx() throws Exception { // 자신을 호출한 19행에 예외처리를 던져 예외처리 오류를 해결
		JFileChooser jc = new JFileChooser();
		int flag = jc.showOpenDialog(null);
		
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		String fileName = jc.getSelectedFile().getPath();
		System.out.println("file : " + fileName);
		File file = new File(fileName);
		
		// InputStream를 사용하여 File을 읽겠다.
//		File file = new File("abc.png");
		FileInputStream readFile = new FileInputStream(file); // 여기서의 readFile는 byte형
		
		flag = jc.showSaveDialog(null);
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		String fileName2 = jc.getSelectedFile().getPath();
		File file2 = new File(fileName2);
		
		// File을 읽자 마자 OutputStream을 사용하여 다른곳에 저장하겠다.
//		File file2 = new File("def.png");
		FileOutputStream writeFile = new FileOutputStream(file2);
		
		// 1byte 씩 읽지 말고 일정한 길이를 정하여 읽자 
		byte[] readByte = new byte[5000]; // 5kb
		int readSize = 0;
		
		while( (readSize = readFile.read(readByte)) != -1 ) { // readFile을 readByte길이 만큼 읽어라 readSize가 -1이 되기 전까지
			writeFile.write(readByte, 0, readSize); // readByte의 길이만큼읽어라, 0 : 처음부터 , readSize 크기만큼
		}
		writeFile.flush();
		writeFile.close();
		readFile.close();
	}
	
	public static void main(String[] args) throws Exception { // 생성자에서 받은 예외처리를 가상머신에 던져 예외처리 오류를 해결
		new FileStreamEx(); // 제 3의 작업, 다른 작업을 하지 않고, 생성자만 생성했다.
	}

}

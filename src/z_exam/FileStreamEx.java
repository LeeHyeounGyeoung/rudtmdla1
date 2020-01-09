package z_exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class FileStreamEx {
	// protected�� �տ� ���̸� ���, ������Ű������ ���� �����ڸ� �����ϴ� ���� ���
	public FileStreamEx() throws Exception { // �ڽ��� ȣ���� 19�࿡ ����ó���� ���� ����ó�� ������ �ذ�
		JFileChooser jc = new JFileChooser();
		int flag = jc.showOpenDialog(null);
		
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		String fileName = jc.getSelectedFile().getPath();
		System.out.println("file : " + fileName);
		File file = new File(fileName);
		
		// InputStream�� ����Ͽ� File�� �аڴ�.
//		File file = new File("abc.png");
		FileInputStream readFile = new FileInputStream(file); // ���⼭�� readFile�� byte��
		
		flag = jc.showSaveDialog(null);
		if(flag != JFileChooser.APPROVE_OPTION) {
			return;
		}
		
		String fileName2 = jc.getSelectedFile().getPath();
		File file2 = new File(fileName2);
		
		// File�� ���� ���� OutputStream�� ����Ͽ� �ٸ����� �����ϰڴ�.
//		File file2 = new File("def.png");
		FileOutputStream writeFile = new FileOutputStream(file2);
		
		// 1byte �� ���� ���� ������ ���̸� ���Ͽ� ���� 
		byte[] readByte = new byte[5000]; // 5kb
		int readSize = 0;
		
		while( (readSize = readFile.read(readByte)) != -1 ) { // readFile�� readByte���� ��ŭ �о�� readSize�� -1�� �Ǳ� ������
			writeFile.write(readByte, 0, readSize); // readByte�� ���̸�ŭ�о��, 0 : ó������ , readSize ũ�⸸ŭ
		}
		writeFile.flush();
		writeFile.close();
		readFile.close();
	}
	
	public static void main(String[] args) throws Exception { // �����ڿ��� ���� ����ó���� ����ӽſ� ���� ����ó�� ������ �ذ�
		new FileStreamEx(); // �� 3�� �۾�, �ٸ� �۾��� ���� �ʰ�, �����ڸ� �����ߴ�.
	}

}

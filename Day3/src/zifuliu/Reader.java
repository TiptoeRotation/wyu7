/**
 * ���ַ���ʵ�ֶ�һ���ļ�����д�Ĳ���
 */
package zifuliu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\IBMpeixun" + File.separator+"test01.txt");
		FileWriter out = new FileWriter(f,true);//׷��
		String str="\r\nHello �ַ���";
		out.write(str);
		out.close();
	}

}

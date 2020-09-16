/**
 * 用字符流实现对一个文件读和写的操作
 */
package zifuliu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\IBMpeixun" + File.separator+"test01.txt");
		FileWriter out = new FileWriter(f,true);//追加
		String str="\r\nHello 字符流";
		out.write(str);
		out.close();
	}

}

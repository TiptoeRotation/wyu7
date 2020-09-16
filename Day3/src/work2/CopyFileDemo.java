/**
 * 2��ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
 */
package work2;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileDemo {
	public static void copyFile(String src,String dest) throws IOException{
		FileInputStream in=new FileInputStream(src);
		File file=new File(dest);
		if(!file.exists())
		file.createNewFile();
		FileOutputStream out=new FileOutputStream(file);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
			for(int i=0;i<c;i++)
				out.write(buffer[i]); 
		}
		in.close();
		out.close();
	}
	public static void main(String[] args) throws IOException {
		String fileSrc="D:\\IBMpeixun\\myfile.txt";
		String fileDes="D:\\IBMpeixun\\myfile_cp.txt";
		copyFile(fileSrc,fileDes);//�����ļ����Ʒ���
		System.out.println("D:\\\\IBMpeixun\\\\myfile_cp.txt�ļ����ļ����Ƴɹ�");
	}
}

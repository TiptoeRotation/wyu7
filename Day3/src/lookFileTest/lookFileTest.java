/**
 * ‘Á…œ¡∑œ∞
 */
package lookFileTest;

import java.io.File;

public class lookFileTest {

	public static void main(String[] args) {
		String path = "D:\\test";
		File file = new File(path);
		String[] fileList = file.list();
		for(int i = 0;i < fileList.length; i++) {
			System.out.println(fileList[i]);
		}
	}
	
}

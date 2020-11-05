package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFastcopy {

	public static void main(String[] args) {
		File src = new File("coco.jpg");
		File dest = new File("copycoco.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10]; // 10kb����
			while(true) {
				int n = fi.read(buf);//���� ũ�⸸ŭ�б� n�� �������� ����Ʈ
				fo.write(buf,0,n); //buf[0]���� n ����Ʈ ����
				if(n < buf.length)
					break;
			}
			fi.close();fo.close();
			System.out.println(src.getPath()+"��"+dest.getPath()+"�� "
					+ "�����Ͽ����ϴ�");
		} catch (IOException e) {System.out.println("���� ���� ����");

	}
	}
}

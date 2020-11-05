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
			byte[] buf = new byte[1024*10]; // 10kb버퍼
			while(true) {
				int n = fi.read(buf);//버퍼 크기만큼읽기 n은 실제읽은 바이트
				fo.write(buf,0,n); //buf[0]부터 n 바이트 쓰기
				if(n < buf.length)
					break;
			}
			fi.close();fo.close();
			System.out.println(src.getPath()+"를"+dest.getPath()+"로 "
					+ "복사하였습니다");
		} catch (IOException e) {System.out.println("파일 복사 오류");

	}
	}
}

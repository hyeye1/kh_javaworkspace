package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		/*
		 * " 바이트 기반 스트림 " 을 가지고 데이터 입출력 해보기
		 * 
		 * 바이트 스트림: 데이터를 1바이트 단위로만 입출력할 수 있는 통로! (좁음) 출력(OutputStream)/입력(InputStream)
		 * 기반 스트림: 외부매체와 직접적으로 연결되는 통로
		 * 
		 * 바이트기반스트림: 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1바이트 단위의 통로를 만들겠다!
		 * 
		 * XXXInputStream: XXX 매체로부터 데이터를 입력받는 통로(외부매체로 부터 데이터를 읽어오겠다 가져오겠다)
		 * xxxOutputStream : xxx  매체로 데이터를 출력받는 통로 (외ㅏ부매체로부터 데이터를 내보내겠다)
		 * 
		 * File Input/Output Stream        => 외부매체로 파일을 지정
		 * Audio Input/Output Stream       => 외부매체로 오디오를 지정
		 * Piped Input/Output Stream       => 외부매체로 또다른 프로세스를 지정
		 */
		
		FileByteDao fb = new FileByteDao();
		//fb.fileSave();
		fb.fileRead();
		 
	}

}

package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		/*
		 * 문자기반스트림
		 외부매체 지정하고 그 외부매체와 직접적으로
		 데이터를 2byte단위로 입츨력
		 */
		
		FileCharDao fd = new FileCharDao();
		//fd.fileSave();
		fd.fileRead();
	}

}

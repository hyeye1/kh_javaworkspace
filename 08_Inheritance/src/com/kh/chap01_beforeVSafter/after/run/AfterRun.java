package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		//desktop��ü����
		
		//Desktop d = new Desktop();
		//d.setpName("¯¯����ũž");
		
		Desktop d = new Desktop("¯¯����ũž", "d-01", "�Ｚ", 2000000, true);
		Tv t = new Tv("�÷���Ƽ��", "t-01", "LG", 3500000, 60);
		SmartPhone s = new SmartPhone("������", "s-01", "����", 1500000, "skt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
	}
	/* ����� ����
	 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ�����
	 * - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
	 * - �ߺ��� �ڵ带 �ٿ��� ������ ���α׷��� ���꼺�� ���������� ũ�� �⿩
	 */

}

package com.kh.chap02_abstractAndInterface.par01_basic.model.vo;

public class Basketball extends Sports {
	//�θ�Ŭ������ �̿ϼ��ȸ޼ҵ带 �ڽ�Ŭ������ �ϼ������ش�
	//���? override��
	
	//�̿ϼ��� Ŭ������ �߻�Ŭ������ ��ӹް� �Ǹ�
	// �θ�Ŭ�������ִ� �߻�޼ҵ带 ������ �������̵��� ���ؼ� �ϼ������־���Ѵ�.
	
	@Override
	public void rule() {
		System.out.println("������ ���� ���� ���� �־�� �ȴ�.");
	}
}

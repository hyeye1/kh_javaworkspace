package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		//super();
		//�׻� �˰Ը𸣰� �θ�����ڸ� ȣ���ϰ��ֱ⶧����
		//�θ�ü�� ���� �޸𸮿����� �Ҵ��� �ȴ�.
		// => �θ� Ŭ������ �⺻�����ڰ� ����� �ȵȴ�.
	}
	
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
		/* 
		 * super. ���� �θ�Ŭ������ ���ٰ���
		 * ��, �����ϰ��� �ϴ� ���������ڰ� private�� ��� ���� ���� �Ұ�
		 * 
		 * �ذ��� 1. �θ��ʵ带 �ڽĿ����� �������ٰ����ϰԲ� protected�� �ϱ�
		super.pName = pName;
		super.pCode = pCode;
		super.brand = brand;
		super.price = price;
		
		 * �ذ��� 2. setter�޼ҵ�(public)�� Ȱ���ϱ� 
		super.setpName(pName);
		super.setpCode(pCode);
		super.setBrand(brand);
		super.setPrice(price);
		
		 * �ذ��� 3. super() �̿��ؼ� �θ�����ڸ� ȣ���ϱ�
		 */
		super(pName, pCode, brand, price);
		
		
		this.allInOne = allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	//�θ�Ŭ������ �޼ҵ尡 ������ �����ʴ´ٸ�?
	// �ڽ�Ŭ�������� �������ϸ� �ȴ�.
	
	public String information() {
		return super.information() + ", allInOne: " +allInOne;
	}

}

package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap();
		
		// ���������� ���� List�� Set�迭�� Collection������ Ŭ���� => �����͸� �߰��� �� add�޼ҵ�
		// ��, Map�� �ƴϴ�. =>> �����͸� �߰��Ҷ� put�޼ҵ�(key+value ��Ʈ�� �߰�)
		
		//1. put(K key, V value)          =>  map ������ key+value ��Ʈ�� �߰����ִ� �޼ҵ�
		hm.put("������", new Snack("���ڸ�", 1500));
		hm.put("ĭ��", new Snack("�ܸ�", 600));
		hm.put("�����", new Snack("§��", 500));
		
		hm.put("��������Ĩ", new Snack("§��", 500));
		
		System.out.println(hm); // ������� ���� x, value���� �����ϴٰ� �ص� Ű���� �ߺ������� �ʱ� ������ �� �����
		
		hm.put("�����", new Snack("�ſ��", 700)); // �ߺ��� Key���� value������ �������
		
		System.out.println(hm);
		
		//2. get(Object key) : V => �÷��ǿ��� �ش� Ű���� Value���� �����ִ� �޼ҵ�
		System.out.println(hm.get("������"));
		
		Snack s = (Snack) hm.get("ĭ��"); //������ͼ� snackŸ���� ������ ������ -> ����ȯ���־����
		System.out.println(s);
		
		//3. size() => �÷��ǿ� ����ִ� ����
		System.out.println("size: " + hm.size());
		
		//4. replace(K key, V value) => �÷��ǿ� �ش� Key���� ã�Ƽ� ���� ���޵� Value�� ��������ִ� �޼ҵ�
		hm.replace("��������Ĩ", new Snack("�̳�§�� ", 1000));
		
		//5. remove(Object key) => �÷��� �ش� Ű�� ã�Ƽ� Ű + value ��Ʈ�� �����ִ� �޼ҵ�
		hm.remove("��������Ĩ");
		System.out.println(hm);
		
		// ���������� Hashmap�� ����ִ� ���� �����ϰ��� �� ��?
		//ArrayList list = new ArrayList(hm);
		
		// iterator()�� List�� set�迭������ ���� �޼ҵ��̱⶧���� �ٷξȵȴ�
		//Iterator it = hm.iterator();
		
		//Map �� set���� �ٲ��ִ� �޼ҵ� ������ (�� 2��)
		//Hashmap == > Set�迭 ==> Iterator
		
		//1. KeySet()�� �̿��ϴ� ���
		
		//1) hm �� �ִ� Ű�鸸 set�� ���(Ű���� ��������)
		Set<String> keySet = hm.keySet();
		
		//2) 1���������� �۾��� keySet�� Iterator�� ���
		// keySet.iterator() : Iterator
		Iterator<String> itKey = keySet.iterator();
		
		//3) �ݺ��ڿ� ���͵� ���������� �̱� (�ݺ��� �̿�)
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("Key : " +key);
			System.out.println("Value : " +value);
		}
		
		//2. entrySet()�̿��ϴ� ���
		
		//1) hm�� �ִ� key+value ��� (Entry)  Set�� ��� (engry��������)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		//List�� Map�� �ٸ������̱⶧���� ArrayList���� �� ����� �Ұ�
		
		
		//2) entrySet�� �ִ� �͵��� Iterator �� ���
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		
		//3) �ݺ����� �̿��ؼ� ���������� �̱�
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		
	}

}

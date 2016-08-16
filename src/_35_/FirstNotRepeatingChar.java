package _35_;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * �ж��ַ����е�һ�����ִ���Ϊ1���ַ�*/
public class FirstNotRepeatingChar {
	public static Character getFirstNotRepeatingChar(String str) throws Exception {
		// �жϱ߽�����
		if (str == null || str.length() < 0) {
			throw new Exception("invalid input");
		}
		// ������ϣ��
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Integer counts = map.get(ch);
			counts = (counts == null) ? 0 : counts;
			map.put(ch, ++counts);
		}
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for (Map.Entry<Character, Integer> entries : set) {
			if (entries.getValue() == 1) {
				return entries.getKey();
			}
		}
		return null;
	}
}

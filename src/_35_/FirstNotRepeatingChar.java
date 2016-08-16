package _35_;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 判断字符串中第一个出现次数为1的字符*/
public class FirstNotRepeatingChar {
	public static Character getFirstNotRepeatingChar(String str) throws Exception {
		// 判断边界条件
		if (str == null || str.length() < 0) {
			throw new Exception("invalid input");
		}
		// 构建哈希表
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

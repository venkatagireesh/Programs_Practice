package testclasses;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("aaa",1);
		map.put("bbb",2);
		map.put("ccc",3);
		map.put("ddd",4);
		
		System.out.println(map.get("ccc"));
	}

}

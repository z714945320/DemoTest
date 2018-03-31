package mapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Object> tempMap = new HashMap<String, Object>(); 
		tempMap.put("key1", "value1");
		tempMap.put("key2", "value2");
		tempMap.put("key3", "value3");
		tempMap.put("key4", "value4");
		List<String> list  = new ArrayList<String>();
		//遍历map中所有key
		//第一種  
        Set<String> set = tempMap.keySet(); //取出所有的key值
        for (String key:set) {
            System.out.println("key存入list集合中："+key); 
            list.add(key);//将key添加到list集合
        }
        int index = 0;
        System.out.println("第二种："+tempMap.get(list.get(index))); 
        index++;
        /*for(int j = 0 ; j < tempMap.size() ; j++) {
			  System.out.println("第二种："+tempMap.get(list.get(index))); 
			  index++;
			}	*/
	}
	
	
}

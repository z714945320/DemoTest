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
		//����map������key
		//��һ�N  
        Set<String> set = tempMap.keySet(); //ȡ�����е�keyֵ
        for (String key:set) {
            System.out.println("key����list�����У�"+key); 
            list.add(key);//��key��ӵ�list����
        }
        int index = 0;
        System.out.println("�ڶ��֣�"+tempMap.get(list.get(index))); 
        index++;
        /*for(int j = 0 ; j < tempMap.size() ; j++) {
			  System.out.println("�ڶ��֣�"+tempMap.get(list.get(index))); 
			  index++;
			}	*/
	}
	
	
}

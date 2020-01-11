import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> map= new TreeMap<String,Integer>();
		map.put("java", 8000);
		map.put("android", 9000);
		map.put("angular", 10000);
		//System.out.println(map);
		//System.out.println(map.get("java"));
		//System.out.println(map.containsKey("android"));
		//System.out.println(map.containsValue(10000));
		map.replace("java",8000,2000);
	//Set<Entry<String,Integer>> entries=map.entrySet();
		for(Map.Entry<String,Integer> entry :map.entrySet())//has a key value pair//
		{
			System.out.println(entry.getKey()+" ----->" +entry.getValue());
	}
		
		for(Map.Entry<String,Integer> entry :map.entrySet())//has a key value pair//
		{
			System.out.println(entry.getKey()+" =====" +entry.getValue());
	}
		
	
	}

}

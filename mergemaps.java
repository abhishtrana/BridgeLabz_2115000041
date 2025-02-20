import java.util.*;
class mergemaps{
	public static void main(String args[]){
		Map<String,Integer> map1=new HashMap<>();
		map1.put("A",1);
		map1.put("B",2);
		Map<String,Integer> map2=new HashMap<>();
		map2.put("B",3);
		map2.put("C",4);
		Map<String,Integer> mergedmaps=new HashMap<>();
		for(String key:map1.keySet()){
			mergedmaps.put(key,map1.get(key));
		}
		for(String key :map2.keySet()){
			mergedmaps.put(key,mergedmaps.getOrDefault(key,0)+map2.get(key));
		}
		  System.out.println(mergedmaps);
    }
}
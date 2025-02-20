import java.util.*;
class FrequencyCount{
	public static Map<String,Integer> countFrequency(List<String> list){
	Map<String,Integer> frequencymap=new HashMap<>();
	for(String word:list){
		frequencymap.put(word,frequencymap.getOrDefault(word,0)+1);
	}
	return frequencymap;
	}
	public static void main(String args[]){
		List<String> words=Arrays.asList("apple", "banana", "apple", "orange");
		Map<String,Integer> frequencymap=countFrequency(words);
		System.out.println("Frequency Map: "+frequencymap);
	}
}
		
	
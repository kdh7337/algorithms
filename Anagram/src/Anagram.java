import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Anagram {

	public static boolean telling(String target1, String target2){
		//return boolean정의;
		boolean result = false;
		if(target1.length()==target2.length()){
		//비교 연산을 위한 해쉬맵 생성
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		//맵에 스트링 담기		
		putToMap(map1,target1);
		putToMap(map2,target2);
		//차순 정렬을 위해 tree맵으로 전달 
		TreeMap<Character, Integer> tre1 = new TreeMap<Character, Integer>(map1);
		TreeMap<Character, Integer> tre2 = new TreeMap<Character, Integer>(map2);
		//비교 분석 
		if(tre1.equals(tre2))
			result = true;
		}
		return result;
		
	}
	//HashMap을 이용하여 중복 값 없는 리스트를 생성한다
	private static void putToMap(HashMap<Character,Integer> map, String target){
		for(int i =0; i < target.length();i++){	
			char current_char = target.charAt(i);
			Set<Character> set = map.keySet();
			if(set.contains(current_char)){
				int number = map.get(current_char);
				map.replace(current_char, number+1);
			}else{
				map.put(current_char, 1);
			}
		}
	}
	
	
	public static boolean compare(String target1, String target2){
		boolean result = false;
		if(target1.length()==target2.length()){
			char temp1[] = target1.toCharArray();
			char temp2[] = target2.toCharArray();
		
			Arrays.sort(temp1);
			Arrays.sort(temp2);
			if(Arrays.equals(temp1,temp2)){
				result = true;
			}
		}
		return result;
	}
}

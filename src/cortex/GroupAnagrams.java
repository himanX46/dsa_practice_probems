package cortex;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strArr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strArr));
    }
    static List<List<String>> groupAnagram(String[] strArr){
        Map<String,List<String>> hMap = new HashMap<>();
        for(int i=0;i<strArr.length;i++){
            char[] ch = strArr[i].toCharArray();
            String origin = new String(ch);
            Arrays.sort(ch);
            String tmp = new String(ch);
            if(hMap.containsKey(tmp)){
                hMap.get(tmp).add(origin);
            }else{
                hMap.put(tmp,new ArrayList<>(Arrays.asList(origin)));
            }
        }
        Iterator<Map.Entry<String,List<String>>> itr = hMap.entrySet().iterator();
        List<List<String>> result = new ArrayList<>();
        while(itr.hasNext()){
            Map.Entry<String,List<String>> it = itr.next();
            result.add(it.getValue());
        }
        return result;
    }
}

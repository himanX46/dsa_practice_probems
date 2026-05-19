package training.IK.mock;

import java.util.*;

public class Mock1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> questionMap = new HashMap<>();
        questionMap.put("Paul", Arrays.asList(1355,1315,1405));
        questionMap.put("Jennifer",Arrays.asList(1910,1335,730));
        questionMap.put("John",Arrays.asList(835,830,1615,1640,855,930,915,730,940,1630));

        Map<String,Set<Integer>> resultMap = findRepeatedTimings(questionMap);
        for(Map.Entry<String,Set<Integer>> entry : resultMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    static Map<String,Set<Integer>> findRepeatedTimings(Map<String,List<Integer>> questionMap ){
        Map<String,Set<Integer>> resultMap = new HashMap<>();
        for(Map.Entry<String,List<Integer>> entry: questionMap.entrySet()){
            List<Integer> times = entry.getValue();
            Collections.sort(times);
            Set<Integer> resultSet = new HashSet<>();
            for(int start=0;start<times.size();start++){
                for(int end=start+2;end<times.size();end++){
                    if(times.get(end)-times.get(start)<=100){
                        for(int k=start;k<=end;k++){
                            resultSet.add(times.get(k));
                        }
                    }else{
                        break;
                    }
                }
            }
            if(!resultSet.isEmpty()){
                resultMap.put(entry.getKey(),resultSet);
            }
        }
        return resultMap;
    }
}

package neetcode.systemDesign;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRU {
    static int faults=0;
    public static void main(String[] args) {
        int[] page = {3,2,1,3,4,1,6,2,4,3,4,2,1,4,5,2,1,3,4};
        int MAXSIZE = 3;
        findPageFaults(page,MAXSIZE);
        System.out.println(faults);
    }
    static void findPageFaults(int[] page, int size){
        Set<Integer> pageList = new LinkedHashSet<Integer>();
        for(int i=0;i<page.length;i++) {
            if(pageList.contains(page[i])){
                shuffle(pageList,page[i]);
            }else{
                processFault(pageList,page[i],size);
            }
        }
        System.out.println(pageList);
    }

    static void shuffle(Set<Integer> pageList, int page){
        pageList.remove(page);
        pageList.add(page);
    }

    static void processFault(Set<Integer> pageList, int page, int size){
        if(pageList.size()==size){
            int lruPage = pageList.iterator().next();
            pageList.remove(lruPage);
            pageList.add(page);
            faults++;
        }else{
            pageList.add(page);
            faults++;
        }
    }
}

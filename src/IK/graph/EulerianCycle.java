package IK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EulerianCycle {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        ArrayList<Integer> edge1 = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> edge2 = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<Integer> edge3 = new ArrayList<>(Arrays.asList(1,3));
        ArrayList<Integer> edge4 = new ArrayList<>(Arrays.asList(3,0));
        ArrayList<Integer> edge5 = new ArrayList<>(Arrays.asList(3,2));
        ArrayList<Integer> edge6 = new ArrayList<>(Arrays.asList(4,3));
        ArrayList<Integer> edge7 = new ArrayList<>(Arrays.asList(4,0));
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);
        edges.add(edge6);
        edges.add(edge7);
        System.out.println(check_if_eulerian_cycle_exists(n,edges));
    }

    static boolean check_if_eulerian_cycle_exists(int n, ArrayList<ArrayList<Integer>> edges){
        ArrayList<Integer> degree = new ArrayList<>(Collections.nCopies(n,0));
        for(ArrayList<Integer> edge : edges){
            degree.set(edge.get(0), degree.get(edge.get(0))+1);
            degree.set(edge.get(1), degree.get(edge.get(1))+1);
        }
        for(int i=0;i<n;i++){
            if(degree.get(i)%2 != 0){
                return false;
            }
        }
        return true;
    }
}

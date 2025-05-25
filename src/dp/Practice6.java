package dp;

public class Practice6 {
    public static void main(String[] args) {
        String s1 = "Anshuman";
        String s2 = "Antihuman";
        System.out.println(findMaxOps(s1,s2));
    }

    private static int findMaxOps(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)){
            return 0;
        }
        if(s1.length()==0 || s2.length()==0){
            return 0;
        }
        if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            return findMaxOps(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1));
        } else{
            return Math.min(Math.min(1+findMaxOps(s1.substring(0,s1.length()-1),s2.substring(0,s2.length())),
                    1+findMaxOps(s1.substring(0,s1.length()),s2.substring(0,s2.length()-1))),
                    1+findMaxOps(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1)));
        }
    }
}

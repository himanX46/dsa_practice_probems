package seventy5;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t){
        int ns = s.length(); //3
        int nt = t.length(); //6
        int count = ns; //3
        if(nt<ns) return false;
        for(int i=0;i<ns;i++){
            for(int j=i;j<nt;j++){
                if(s.charAt(i)==t.charAt(j)){
                    count--;
                    break;
                }
            }
        }
        return count==0;
    }
}

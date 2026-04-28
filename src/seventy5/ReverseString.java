package seventy5;

public class ReverseString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int finder = n-1;
        while(finder>=0){
            if(finder == 0){
                int ptr = finder;
                while(s.charAt(ptr)!=' '){
                    sb.append(s.charAt(ptr++));
                }
            }
            if(s.charAt(finder)!=' '){
                finder--;
            }else{
                int ptr = finder+1;
                while(ptr<=n-1 && s.charAt(ptr)!=' '){
                    sb.append(s.charAt(ptr++));
                }
                sb.append(' ');
                finder--;
            }
        }
        return sb.toString();
    }
}

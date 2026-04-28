package cortex;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(revereWords(s));
    }

    static String revereWords(String s){
        int end = s.length()-1;
        int endOfString = s.length();
        StringBuilder result = new StringBuilder();
        while(end>=0){
            while(end>=0 && s.charAt(end)!=' '){
                end--;
            }
            if(end>=0 && s.charAt(end)==' '){
                result.append(s.substring(end+1,endOfString));
                result.append(" ");
                endOfString = end;
                end--;
            }
            if(end<0){
                result.append(s.substring(end+1,endOfString));
            }
        }
        return result.toString();
    }
}

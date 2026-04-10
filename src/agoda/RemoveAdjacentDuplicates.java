package agoda;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeAdjDuplicates(s));
    }
    static String removeAdjDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!sb.isEmpty()){
                if(s.charAt(i)==sb.charAt(sb.length()-1)){
                    sb.deleteCharAt(sb.length()-1);
                }else{
                    sb.append(s.charAt(i));
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

package trie;

public class InsertFunctionalities {
    public static void main(String[] args) {

    }

    private static void insert(TrieNode root, String key){
        TrieNode curr = root;
        for(char c : key.toCharArray()){
            if(curr.children[c-'a']==null){
                TrieNode node = new TrieNode();
                curr.children[c-'a'] = node;
            }
            curr = curr.children[c-'a'];
        }
        curr.isEndOfWord = true;
    }

    private boolean search(TrieNode root, String key){
        TrieNode curr = root;
        for(char c : key.toCharArray()){
            if(curr.children[c-'a']==null){
                return false;
            }
            curr = curr.children[c-'a'];
        }
        return curr.isEndOfWord;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfString  = true;
        System.out.println("inserted word : "+word);
    }
    public boolean search(String word){
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("Word : "+word+" does not exist in trie");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString) {
            System.out.println("Word : "+word+" exist in trie");
            return true;
        }else {
            System.out.println("Word : "+word+" does not exist in trie,but a prefix");
        }
        return currentNode.endOfString;
    }
    private boolean delete(TrieNode parentNode, String word,int index){
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisBeDeleted;

        if (currentNode.children.size() > 1) {
            delete(currentNode,word,index+1);
            return false;
        }
        if (index == word.length() - 1) {
            if (!currentNode.children.isEmpty()) {
                currentNode.endOfString = false;
                return false;
            }  else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currentNode.endOfString) {
            delete(currentNode,word,index+1);
            return false;
        }
        canThisBeDeleted = delete(currentNode,word,index+1);
        if (canThisBeDeleted){
            parentNode.children.remove(ch);
            return true;
        }else {
            return false;
        }
    }
    public void delete(String word){
        if (search(word)){
            delete(root,word,0);
        }
    }
}

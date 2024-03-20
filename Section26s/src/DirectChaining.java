import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashtable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
        hashtable = new LinkedList[size];
    }
    public int modASCIIHashFunction(String word,int M){
        char[] ch = word.toCharArray();
        int sum=0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum+ch[i];
        }
        return sum%M;
    }
    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashtable.length);
        if (hashtable[newIndex] == null) {
            hashtable[newIndex] = new LinkedList<>();
            hashtable[newIndex].add(word);
        }else {
            hashtable[newIndex].add(word);
        }
    }
    public void displayHashTable(){
        if (hashtable == null) {
            System.out.println("\nHashTable is empty");
            return;
        }else {
            System.out.println("\n-----------HashTable-----------");
            for (int i = 0; i < hashtable.length; i++) {
                System.out.println("Index "+i+", key : "+hashtable[i]);
            }
        }
    }
    boolean searchHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashtable.length);
        if (hashtable[newIndex]!=null && hashtable[newIndex].contains(word)){
            System.out.println("string : "+word+", found at hastable index : "+newIndex+"\n");
            return true;
        }else {
            System.out.println("string : "+word+", not found at hastable\n");
            return false;
        }
    }
    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashtable.length);
        if (searchHashTable(word)){
            hashtable[newIndex].remove(word);
            System.out.println("string : "+word+", deleted from hastable\n");
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int M) {
        char[] ch = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        Collections.addAll(data, hashTable);
        data.add(word);
        hashTable = new String[hashTable.length * 2];
        for (String s :
                data) {
            insertInHashTable(s);
        }
    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor>=0.75){
            rehashKeys(word);
        }else {
            int index = modASCIIHashFunction(word,hashTable.length);
            for (int i = index ; i <index+hashTable.length ; i++) {
                int newIndex = i%hashTable.length;
                if (hashTable[newIndex]==null){
                    hashTable[newIndex] = word;
                    System.out.println("string : "+word+", inserted at hastable index : "+newIndex);
                    break;
                }else {
                    System.out.println("index : "+newIndex+" already occupied, Trying next empty cell");
                }
            }
        }
        usedCellNumber++;
    }
    public void displayHashTable(){
        if (hashTable == null) {
            System.out.println("\nHashTable is empty");
            return;
        }else {
            System.out.println("\n-----------HashTable-----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index "+i+", key : "+hashTable[i]);
            }
        }
    }
    public boolean searchHashTable(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for (int i = index ; i <index+hashTable.length ; i++) {
            int newIndex = i%hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                System.out.println(word+" found at locatoin: "+newIndex);
                return  true;
            }
        }
        System.out.println(word+" not found in hastable");
        return false;
    }
    public void deleteKeyHashTable(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                hashTable[newIndex] = null;
                System.out.println(word+" has been deleted form hashtable");
                return;
            }
        }
        System.out.println(word+" not foung in hashtable");
    }

}

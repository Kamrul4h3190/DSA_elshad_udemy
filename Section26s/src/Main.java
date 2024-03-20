import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        /*DirectChaining directChaining = new DirectChaining(13);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("quick");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("fox");
        directChaining.insertHashTable("over");
        //directChaining.displayHashTable();
        directChaining.deleteKeyHashTable("fox");
        directChaining.displayHashTable();*/
        /*LinearProbing linearProbing = new LinearProbing(13);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("quick");
        linearProbing.insertInHashTable("brown");
        linearProbing.insertInHashTable("fox");
        linearProbing.insertInHashTable("over");
        linearProbing.deleteKeyHashTable("over");
        linearProbing.displayHashTable();*/
        /*QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertKeyInHashTable("The");
        quadraticProbing.insertKeyInHashTable("quick");
        quadraticProbing.insertKeyInHashTable("brown");
        quadraticProbing.insertKeyInHashTable("fox");
        quadraticProbing.insertKeyInHashTable("over");
        quadraticProbing.insertKeyInHashTable("lazy");
        quadraticProbing.displayHashTable();*/
        DoubleHashing doubleHashing  = new DoubleHashing(13);
        doubleHashing.insertKeyInHashTable("The");
        doubleHashing.insertKeyInHashTable("quick");
        doubleHashing.insertKeyInHashTable("brown");
        doubleHashing.insertKeyInHashTable("fox");
        doubleHashing.insertKeyInHashTable("over");
        doubleHashing.insertKeyInHashTable("lazy");
        doubleHashing.displayHashTable();
    }
}
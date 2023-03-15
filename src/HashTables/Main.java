package HashTables;

import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for(int i : array1){
            myHashMap.put(i, true);
        }

        for(int j : array2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
//        myHashTable.set("screws", 140);


        System.out.println(myHashTable.keys());
//        System.out.println(myHashTable.get("lumber"));
//        System.out.println(myHashTable.get("bolts"));
    }
}

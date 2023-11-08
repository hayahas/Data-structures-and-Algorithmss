package hashtable;

import org.checkerframework.checker.units.qual.K;

import java.util.*;

public class HashTable<T> {

    int size;
    Node<T> hashArray[];


    public HashTable(int size){
        this.size=size;
        hashArray=new Node[size];
        for(int i=0;i<hashArray.length;i++){
            hashArray[i]= new Node<T>();
        }
    }

    public List<Integer> keys(){
        List<Integer> keyList = new ArrayList<>();

        for (Node<T> bucket : hashArray) {
            Node<T> current = bucket;
            while (current != null) {
                if (current.getValue() != null)
                {
                    keyList.add(current.getKey());
                }
                current = current.next;
            }
        }

        return keyList;
    }


    public int hash(int key){
        return key%size;
    }

    public void set(int key,T value){
        int index = hash(key);
        Node<T> originalValue = hashArray[index];
        Node<T> newValue = new Node<>(key,value);
        newValue.next=originalValue.next;
        originalValue.next=newValue;
    }


    public T get(int key){
        int index = hash(key);
        Node<T> current = hashArray[index];
        while(current != null){
            if(current.getKey() == key)
                return current.getValue();

            current=current.next;
        }
        return null;
    }

    public boolean has(int key) {
        for (int i = 0; i < hashArray.length; i++) {
            Node<T> current = hashArray[i];
            while (current != null) {
                if(current.getKey() == key){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }


    public String repeatedWord(String str) {
        if(str.isEmpty() || str == null) throw new NullPointerException("your String is Empty") ;

        List<String> words = List.of(str.split("[,\\s]+"));

        HashMap<String,Integer> wordsTable =new HashMap<>();
        for(int i=0;i<words.size();i++){
            if(wordsTable.containsKey(words.get(i))){
                return words.get(i);
            }
            wordsTable.put(words.get(i),i);
        }

        return "No Repeated Words!";
    }


}


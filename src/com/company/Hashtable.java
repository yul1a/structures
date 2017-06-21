package com.company;

import java.util.List;

public class Hashtable {

    List<List<Pair<String, String>>> table;

    void push(String key, String value){
        int hashCode = key.hashCode();
        int index = hashCode%table.size();
        List<Pair<String, String>> strings = table.get(index);
        strings.add(new Pair<String, String>(key, value)); // todo коллизия?
    }
    String get(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % table.size();
        List<Pair<String, String>> strings = table.get(index);
        for (Pair<String, String> pair : strings) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        return null;
    }
}

class Pair<T1, T2> {
    public Pair(T1 key, T2 value){
        this.key = key;
        this.value = value;
    }
    T1 key;
    T2 value;
}



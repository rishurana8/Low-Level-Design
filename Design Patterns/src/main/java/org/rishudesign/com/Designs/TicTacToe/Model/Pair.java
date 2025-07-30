package org.rishudesign.com.Designs.TicTacToe.Model;

public class Pair<K,V> {
    public final K key;
    public final V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
}

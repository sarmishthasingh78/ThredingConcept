package org.example.threadSafty;

import java.util.HashMap;
import java.util.concurrent.*;
public class ByConcurrentHashMap {
    public static void main(String args[]){
       //  HashMap<String, String> map = new HashMap<>();
       // So in this case it will the concurrentModification Exception withOut  ConcurrentHashMap
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("name","sarmishtha");
        map.put("education","MCA");

        System.out.println(map.get("name" ) + " ,"+ map.get("education"));
    }
}

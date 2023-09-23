package com.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CustomCache  {
public static void main(String[] args) {
	LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
	lhm.put("5","");
	lhm.put("2","");
	lhm.put("4","");
	lhm.keySet().forEach(System.out::println);
	
}
    private HashMap<String, Object> cacheMap;
    private int maxSize;

    public CustomCache(int maxSize) {
        this.maxSize = maxSize;
        this.cacheMap = new HashMap<String, Object>();
    }

    public synchronized void put(String key, Object value) {
        // If the cache is full, remove the oldest entry
        if (cacheMap.size() >= maxSize) {
            String oldestKey = cacheMap.keySet().iterator().next();
            cacheMap.remove(oldestKey);
        }
        // Add the new entry to the cache
        cacheMap.put(key, value);
    }

    public synchronized Object get(String key) {
        Object value = cacheMap.get(key);
        return value;
    }

    public synchronized void clear() {
        cacheMap.clear();
    }
}

package com.programs;
 
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        HashMap<Character,Integer> tmpMap = new HashMap<>();
        a.chars().forEach(now ->  {
             Character key1= Character.valueOf((char)now);
             key1 = Character.toLowerCase(key1);
             
            if(tmpMap.containsKey(key1)) {
               tmpMap.put(key1,1+tmpMap.get(key1));
            }else {
                 tmpMap.put(key1,1 );
            }
            
        });
         HashMap<Character,Integer> tmpMap1 = new HashMap<>();
        b.chars().forEach(now ->  {
             Character key1= Character.valueOf((char)now);
             key1 = Character.toLowerCase(key1);
            if(tmpMap1.containsKey(key1)) {
               tmpMap1.put(key1,1+tmpMap1.get(key1));
            }else {
                 tmpMap1.put(key1,1 );
            }
            
        });
        
        if(tmpMap1.size() != tmpMap.size()) {
            return false;
        }
        for(Character key: tmpMap1.keySet()) {
        	if(!(tmpMap1.get(key).intValue() == tmpMap.get(key).intValue())) {
        		return false;
        	}
        }
        
        
        
        return true;
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
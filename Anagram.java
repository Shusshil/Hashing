package Hashing;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isAnagram("aabbc", "ababc"));
	}
	public static boolean isAnagram(String s1, String s2){
	     HashMap<Character, Integer> map1=new HashMap<>();
	     HashMap<Character, Integer> map2=new HashMap<>();
	     int n=s1.length();
	     int m=s2.length();
	     for(int i=0;i<n;i++){
	         char c=s1.charAt(i);
	         if(map1.containsKey(c))
	             map1.put(c,map1.get(c)+1);
	         else
	             map1.put(c,1);
	     }
	     for(int i=0;i<m;i++){
	         char c=s2.charAt(i);
	         if(map2.containsKey(c))
	             map2.put(c,map2.get(c)+1);
	         else
	             map2.put(c,1);
	     }
	     if(map1.size() != map2.size())
	         return false;
	     
	     Iterator <Character> it = map1.keySet().iterator();
	     
	     while(it.hasNext()){
	         char key=(char)it.next();
	         if(!map2.containsKey(key))
	            return false;
	         
	         if(map1.get(key) != map2.get(key))
	            return false;
	     }
	     return true;
	}
}
// console.log
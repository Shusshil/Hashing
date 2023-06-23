package Hashing;
import java.util.*;
public class K_Window {
	public static void main(String[] args) {
	    int[] a={1,2,1,3,1,4,2,3};
	    kDistinct(a, 4);
	}
	public static void kDistinct(int[] a, int k){
	    HashMap<Integer, Integer> count=new HashMap<>();
	    for(int i=0;i<k;i++){
	        if(count.containsKey(a[i])){
	            count.put(a[i],count.get(a[i])+1);
	        }
	        else
	            count.put(a[i],1);
	    }
	    System.out.print(count.size()+" ");
	    
	    for(int i=k;i<a.length;i++){
	        if(count.get(a[i-k])==1)
	            count.remove(a[i-k]);
	        else
	            count.put(a[i-k],count.get(a[i-k])-1);
	            
	        if(count.containsKey(a[i])){
	            count.put(a[i],count.get(a[i])+1);
	        }
	        else
	            count.put(a[i],1);
	            
	        System.out.print(count.size()+" ");
	    }
	}
}
